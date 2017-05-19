package com.mobsoft.mobilsoft.iotapp.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.R;
import com.mobsoft.mobilsoft.iotapp.ui.main.MainActivity;

import javax.inject.Inject;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by adam on 2017. 04. 06..
 */

public class LoginActivity extends AppCompatActivity implements LoginScreen {
    Button b1;
    EditText ed1,ed2;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MobSoftApplication.injector.inject(this);

        b1 = (Button)findViewById(R.id.login_button);
        ed1 = (EditText)findViewById(R.id.username_text);
        ed2 = (EditText)findViewById(R.id.password_text);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.authUser(ed1.getText().toString(), ed2.getText().toString());
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    }
                }, 1000);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        loginPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        loginPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
