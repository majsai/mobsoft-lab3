package com.mobsoft.mobilsoft.iotapp.ui.main;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.mobsoft.mobilsoft.iotapp.MobSoftApplication;
import com.mobsoft.mobilsoft.iotapp.R;
import com.mobsoft.mobilsoft.iotapp.model.SensorNode;
import com.mobsoft.mobilsoft.iotapp.ui.login.LoginActivity;
import com.mobsoft.mobilsoft.iotapp.ui.map.MapActivity;

import java.util.ArrayList;
import java.util.List;

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

        Button btn = (Button) findViewById(R.id.button);
        ListView listView = (ListView) findViewById(R.id.node_list);

        Log.i("MainActivity", "Created");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Clicked button", "click");
                mainPresenter.getNodes();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);

                //based on item add info to intent

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, MapActivity.class));
                    }
                }, 1000);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);

        mainPresenter.getNodes();
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

    @Override
    public void setNodes(List<SensorNode> nodes) {
        List<String> nodeNames = new ArrayList<>();

        for(int i = 0; i < nodes.size(); i++){
            nodeNames.add(nodes.get(i).getName());
        }

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, nodeNames);

        ListView listView = (ListView) findViewById(R.id.node_list);
        listView.setAdapter(adapter);
    }
}
