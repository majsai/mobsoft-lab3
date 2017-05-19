package com.mobsoft.mobilsoft.iotapp.utils;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobsoft.mobilsoft.iotapp.R;
import com.mobsoft.mobilsoft.iotapp.model.SensorNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mobsoft on 2017. 05. 19..
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private List<SensorNode> sensorNodes;

    public CustomList(Activity context, List<SensorNode> nodes, List<String> nodeNames) {
        super(context, R.layout.list_single, nodeNames);

        this.context = context;
        this.sensorNodes = sensorNodes;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView);
        txtTitle.setText(sensorNodes.get(position).getName());

        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textView2);
        txtTitle2.setText(sensorNodes.get(position).getTemperature() + "C, " + sensorNodes.get(position).getHumidity() + "%");

        return rowView;
    }
}
