package com.mobsoft.mobilsoft.iotapp.repository;

import android.content.Context;

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;
import com.mobsoft.mobilsoft.iotapp.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

public class MemoryRepository implements Repository {

    public static List<SensorNode> sensorNodes;
    public static User activeUser;

    @Override
    public void open(Context context) {
        //Long id, String name, float longitude, float latitude, float temperature, float humidity
        SensorNode node1 = new SensorNode(1l, "Sensor one", 19.0f, 47.5f, 20, 45);
        SensorNode node2 = new SensorNode(2l, "Sensor two", 19.1f, 47.4f, 22, 36);
        SensorNode node3 = new SensorNode(3l, "Sensor three", 19.08f, 47.44f, 19, 32);

        sensorNodes = new ArrayList<>();
        sensorNodes.add(node1);
        sensorNodes.add(node2);
        sensorNodes.add(node3);

        activeUser = new User(1l, "probauser", "123123");
    }

    @Override
    public void close() {

    }

    @Override
    public boolean authUser(User user) {
        return true;
    }

    @Override
    public void addNode(SensorNode node) {
        sensorNodes.add(node);
    }

    @Override
    public SensorNode getNodeInfo(SensorNode node) {
        return sensorNodes.get(node.getId().intValue());
    }

    @Override
    public List<SensorNode> getNodes() {
        return sensorNodes;
    }
}
