package com.mobsoft.mobilsoft.iotapp.model;

import com.orm.SugarRecord;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

public class SensorNode extends SugarRecord {
    private Long id;

    private String name;

    private float longitude;
    private float latitude;

    private float temperature;
    private float humidity;


    public SensorNode() {
    }

    public SensorNode(Long id, String name, float longitude, float latitude, float temperature, float humidity) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public Long getId(){
        return id;
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
