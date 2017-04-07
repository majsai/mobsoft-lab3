package com.mobsoft.mobilsoft.iotapp.ui;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

import android.content.Context;


import com.mobsoft.mobilsoft.iotapp.ui.login.LoginPresenter;
import com.mobsoft.mobilsoft.iotapp.ui.main.MainPresenter;
import com.mobsoft.mobilsoft.iotapp.ui.map.MapPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() { return new LoginPresenter(); }

    @Provides
    @Singleton
    public MapPresenter provideMapPresenter() { return new MapPresenter(); }

    @Provides
    @Singleton
    public EventBus provideEventBus() {
        return EventBus.getDefault();
    }
}