package com.mobsoft.mobilsoft.iotapp.ui.login;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.mobsoft.mobilsoft.iotapp.interactor.user.UserInteractor;
import com.mobsoft.mobilsoft.iotapp.interactor.user.events.AuthUserEvent;
import com.mobsoft.mobilsoft.iotapp.model.User;
import com.mobsoft.mobilsoft.iotapp.ui.Presenter;
import com.mobsoft.mobilsoft.iotapp.ui.main.MainActivity;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

import static android.support.v4.content.ContextCompat.startActivity;
import static com.mobsoft.mobilsoft.iotapp.MobSoftApplication.injector;

/**
 * Created by adam on 2017. 04. 06..
 */

public class LoginPresenter extends Presenter<LoginScreen> {

    @Inject
    UserInteractor userInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    @Override
    public void attachScreen(LoginScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen(){
        bus.unregister(this);
        super.detachScreen();
    }

    public void authUser(String usr, String pw){
        userInteractor.authUser(new User(0l,usr,pw));
    }


    public void onEventMainThread(AuthUserEvent event) {
        Log.d("test","test");
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if (screen != null) {
                screen.showMessage("Login successful:");
            }
        }
    }
}
