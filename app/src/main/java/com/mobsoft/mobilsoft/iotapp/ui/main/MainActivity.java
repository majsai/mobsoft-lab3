package com.mobsoft.mobilsoft.iotapp.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreen {
    private String[] mobileArray = {"Alma", "Körte"};

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobSoftApplication.injector.inject(this);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, mobileArray);

        ListView listView = (ListView) findViewById(R.id.node_list);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
