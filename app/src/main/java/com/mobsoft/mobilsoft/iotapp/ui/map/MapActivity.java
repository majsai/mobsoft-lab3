package com.mobsoft.mobilsoft.iotapp.ui.map;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.R;

import javax.inject.Inject;

/**
 * Created by adam on 2017. 04. 06..
 */

public class MapActivity extends AppCompatActivity implements MapScreen {

    @Inject
    MapPresenter mapPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        MobSoftApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapPresenter.detachScreen();
    }
}
