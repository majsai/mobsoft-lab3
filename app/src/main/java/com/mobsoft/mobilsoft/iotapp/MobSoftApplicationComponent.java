package com.mobsoft.mobilsoft.iotapp;

/**
 * Created by mobsoft on 2017. 03. 24..
 */
import com.mobsoft.mobilsoft.iotapp.ui.UIModule;
import com.mobsoft.mobilsoft.iotapp.ui.login.LoginActivity;
import com.mobsoft.mobilsoft.iotapp.ui.main.MainActivity;
import com.mobsoft.mobilsoft.iotapp.ui.map.MapActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginA);
    void inject(MapActivity mapA);

}
