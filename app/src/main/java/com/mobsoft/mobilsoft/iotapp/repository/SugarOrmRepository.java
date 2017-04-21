package com.mobsoft.mobilsoft.iotapp.repository;

import android.content.Context;

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;
import com.mobsoft.mobilsoft.iotapp.model.User;
import com.orm.SugarContext;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

public class SugarOrmRepository implements Repository {
    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public boolean authUser(User user) {
        return false;
    }

    @Override
    public void addNode(SensorNode node) {

    }

    @Override
    public SensorNode getNodeInfo(SensorNode node) {
        return null;
    }
}
