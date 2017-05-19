package com.mobsoft.mobilsoft.iotapp;

import android.app.Application;

import com.mobsoft.mobilsoft.iotapp.repository.Repository;
import com.mobsoft.mobilsoft.iotapp.ui.UIModule;

import javax.inject.Inject;

/**
 * Created by mobsoft on 2017. 03. 24..
 */


public class MobSoftApplication extends Application {

    @Inject
    Repository repository;

    public static MobSoftApplicationComponent injector;


    public void setInjector(MobSoftApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
        repository.open(getApplicationContext());
    }

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
