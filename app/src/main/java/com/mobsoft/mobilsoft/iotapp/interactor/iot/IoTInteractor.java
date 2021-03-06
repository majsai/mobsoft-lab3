package com.mobsoft.mobilsoft.iotapp.interactor.iot;

import android.util.Log;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.interactor.iot.events.AddNodeEvent;
import com.mobsoft.mobilsoft.iotapp.interactor.iot.events.GetNodeInfoEvent;
import com.mobsoft.mobilsoft.iotapp.interactor.iot.events.GetNodesEvent;
import com.mobsoft.mobilsoft.iotapp.model.SensorNode;
import com.mobsoft.mobilsoft.iotapp.network.node.NodeApi;
import com.mobsoft.mobilsoft.iotapp.repository.Repository;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

public class IoTInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    @Inject
    NodeApi nodeApi;

    public IoTInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void addNode(SensorNode node) {
        try{
            repository.addNode(node);
            AddNodeEvent event = new AddNodeEvent(node);
            bus.post(event);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void getNodeInfo(SensorNode node) {
        try{
            SensorNode returnNode = repository.getNodeInfo(node);

            GetNodeInfoEvent event = new GetNodeInfoEvent(returnNode);
            bus.post(event);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void getNodes() {
        try{
            //List<SensorNode> nodeList = nodeApi.getNodes().execute().body();

            repository.open(null);
            List<SensorNode> nodeList = repository.getNodes();
            GetNodesEvent event = new GetNodesEvent(nodeList);
            Log.i("Got nodes: ", "Got nodes: " + nodeList.size());
            bus.post(event);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
