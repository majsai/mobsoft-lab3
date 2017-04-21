package com.mobsoft.mobilsoft.iotapp.interactor.user;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.interactor.user.events.AuthUserEvent;
import com.mobsoft.mobilsoft.iotapp.model.User;
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

    public void authUser(User user) {
        try {
            boolean result = repository.authUser(user);
            AuthUserEvent event = new AuthUserEvent(result, user);
            bus.post(event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
