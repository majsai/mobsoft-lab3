package com.mobsoft.mobilsoft.iotapp.interactor.iot.events;

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;

/**
 * Created by adam on 2017. 04. 20..
 */

public class GetNodeInfoEvent {
    private SensorNode sensorNode;

    public GetNodeInfoEvent(SensorNode sensorNode) {
        this.sensorNode = sensorNode;
    }

    public SensorNode getSensorNode() {
        return sensorNode;
    }

    public void setSensorNode(SensorNode sensorNode) {
        this.sensorNode = sensorNode;
    }
}
