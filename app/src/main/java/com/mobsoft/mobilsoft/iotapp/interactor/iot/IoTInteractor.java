package com.mobsoft.mobilsoft.iotapp.interactor.iot;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.repository.Repository;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

public class IoTInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    public IoTInteractor() {
        MobSoftApplication.injector.inject(this);
    }
}
