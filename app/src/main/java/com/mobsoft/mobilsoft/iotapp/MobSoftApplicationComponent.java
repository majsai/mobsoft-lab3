package com.mobsoft.mobilsoft.iotapp;

/**
 * Created by mobsoft on 2017. 03. 24..
 */
import com.mobsoft.mobilsoft.iotapp.interactor.InteractorModule;
import com.mobsoft.mobilsoft.iotapp.interactor.iot.IoTInteractor;
import com.mobsoft.mobilsoft.iotapp.interactor.user.UserInteractor;
import com.mobsoft.mobilsoft.iotapp.network.NetworkModule;
import com.mobsoft.mobilsoft.iotapp.repository.RepositoryModule;
import com.mobsoft.mobilsoft.iotapp.ui.UIModule;
import com.mobsoft.mobilsoft.iotapp.ui.login.LoginActivity;
import com.mobsoft.mobilsoft.iotapp.ui.login.LoginPresenter;
import com.mobsoft.mobilsoft.iotapp.ui.main.MainActivity;
import com.mobsoft.mobilsoft.iotapp.ui.main.MainPresenter;
import com.mobsoft.mobilsoft.iotapp.ui.map.MapActivity;
import com.mobsoft.mobilsoft.iotapp.ui.map.MapPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class, NetworkModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(MainPresenter mainPresenter);

    void inject(MobSoftApplication mobSoftApplication);

    void inject(LoginActivity loginA);
    void inject(LoginPresenter loginPresenter);

    void inject(MapActivity mapA);
    void inject(MapPresenter mapPresenter);

    void inject(IoTInteractor ioTInteractor);
    void inject(UserInteractor userInteractor);

}
