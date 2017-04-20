package com.mobsoft.mobilsoft.iotapp.interactor;

import com.mobsoft.mobilsoft.iotapp.interactor.iot.IoTInteractor;
import com.mobsoft.mobilsoft.iotapp.interactor.user.UserInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

@Module
public class InteractorModule {

    @Provides
    public IoTInteractor provideIoTInteractor(){return new IoTInteractor();}

    @Provides
    public UserInteractor provideUserInteractor(){return new UserInteractor();}
}
