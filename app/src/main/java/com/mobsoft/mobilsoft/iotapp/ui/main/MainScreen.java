package com.mobsoft.mobilsoft.iotapp.ui.main;

import android.support.v7.app.AppCompatActivity;

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;

import java.util.List;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public interface MainScreen {
    void showMessage(String text);
    void setNodes(List<SensorNode> nodes);
}
