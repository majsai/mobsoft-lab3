package com.mobsoft.mobilsoft.iotapp.interactor.user.events;

import com.mobsoft.mobilsoft.iotapp.model.User;

/**
 * Created by adam on 2017. 04. 20..
 */

public class AuthUserEvent {
    private boolean authSuccess;
    private User user;
    private Throwable throwable;

    public AuthUserEvent(boolean authSuccess, User user) {
        this.authSuccess = authSuccess;
        this.user = user;
    }

    public boolean isAuthSuccess() {
        return authSuccess;
    }

    public void setAuthSuccess(boolean authSuccess) {
        this.authSuccess = authSuccess;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}
