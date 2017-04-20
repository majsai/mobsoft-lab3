package com.mobsoft.mobilsoft.iotapp.ui.login;

import com.mobsoft.mobilsoft.iotapp.interactor.user.UserInteractor;
import com.mobsoft.mobilsoft.iotapp.ui.Presenter;

import javax.inject.Inject;

/**
 * Created by adam on 2017. 04. 06..
 */

public class LoginPresenter extends Presenter<LoginScreen> {
    @Inject
    UserInteractor userInteractor;

    @Override
    public void attachScreen(LoginScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
