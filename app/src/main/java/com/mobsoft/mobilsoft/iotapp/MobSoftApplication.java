package com.mobsoft.mobilsoft.iotapp;

import android.app.Application;

import com.mobsoft.mobilsoft.iotapp.ui.UIModule;

/**
 * Created by mobsoft on 2017. 03. 24..
 */


public class MobSoftApplication extends Application {

    public static MobSoftApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerMobSoftApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}
