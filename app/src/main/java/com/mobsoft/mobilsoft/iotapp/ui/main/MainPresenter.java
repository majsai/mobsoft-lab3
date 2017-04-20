package com.mobsoft.mobilsoft.iotapp.ui.main;

import com.mobsoft.mobilsoft.iotapp.interactor.iot.IoTInteractor;
import com.mobsoft.mobilsoft.iotapp.ui.Presenter;

import javax.inject.Inject;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    IoTInteractor ioTInteractor;

    public MainPresenter() {
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
