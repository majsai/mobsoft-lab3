package com.mobsoft.mobilsoft.iotapp.interactor.user;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.repository.Repository;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by adam on 2017. 04. 20..
 */

public class UserInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    public UserInteractor() {
        MobSoftApplication.injector.inject(this);
    }
}
