package com.mobsoft.mobilsoft.iotapp.ui.map;

import com.mobsoft.mobilsoft.iotapp.interactor.iot.IoTInteractor;
import com.mobsoft.mobilsoft.iotapp.ui.Presenter;

import javax.inject.Inject;

/**
 * Created by adam on 2017. 04. 06..
 */

public class MapPresenter extends Presenter<MapScreen> {
    @Inject
    IoTInteractor ioTInteractor;

    @Override
    public void attachScreen(MapScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
