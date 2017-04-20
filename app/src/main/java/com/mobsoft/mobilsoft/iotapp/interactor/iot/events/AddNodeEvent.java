package com.mobsoft.mobilsoft.iotapp.interactor.iot.events;

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;

/**
 * Created by adam on 2017. 04. 20..
 */

public class AddNodeEvent {
    private SensorNode node;

    public AddNodeEvent(SensorNode node) {
        this.node = node;
    }

    public SensorNode getNode() {
        return node;
    }

    public void setNode(SensorNode node) {
        this.node = node;
    }
}
