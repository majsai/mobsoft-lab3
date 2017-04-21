package com.mobsoft.mobilsoft.iotapp.repository;

import android.content.Context;

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;
import com.mobsoft.mobilsoft.iotapp.model.User;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

public interface Repository {
    void open(Context context);

    void close();

    public boolean authUser(User user);

    public void addNode(SensorNode node);

    public SensorNode getNodeInfo(SensorNode node);
}
