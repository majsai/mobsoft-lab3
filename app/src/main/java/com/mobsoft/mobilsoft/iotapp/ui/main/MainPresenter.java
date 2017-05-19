package com.mobsoft.mobilsoft.iotapp.ui.main;

import android.util.Log;

import com.mobsoft.mobilsoft.iotapp.interactor.iot.IoTInteractor;
import com.mobsoft.mobilsoft.iotapp.interactor.iot.events.GetNodesEvent;
import com.mobsoft.mobilsoft.iotapp.model.SensorNode;
import com.mobsoft.mobilsoft.iotapp.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

import static com.mobsoft.mobilsoft.iotapp.MobSoftApplication.injector;

/**
 * Created by mobsoft on 2017. 03. 24..
 */

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    IoTInteractor ioTInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen(){
        bus.unregister(this);
        super.detachScreen();
    }

    public void getNodes() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                ioTInteractor.getNodes();
            }
        });
    }

    public void onEventMainThread(GetNodesEvent event) {
        Log.d("test","test");
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if (screen != null) {
                for(SensorNode t : event.getSensors()){
                    screen.showMessage(t.getName());
                }
                screen.setNodes(event.getSensors());
            }
        }
    }
}
