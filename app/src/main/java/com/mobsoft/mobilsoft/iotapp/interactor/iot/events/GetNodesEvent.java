package com.mobsoft.mobilsoft.iotapp.interactor.iot.events;

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;

import java.util.List;

/**
 * Created by mobsoft on 2017. 04. 21..
 */

public class GetNodesEvent {
    private List<SensorNode> sensors;

    public GetNodesEvent(List<SensorNode> sensors) {
        this.sensors = sensors;
    }

    public List<SensorNode> getSensors() {
        return sensors;
    }

    public void setSensors(List<SensorNode> sensors) {
        this.sensors = sensors;
    }
}
