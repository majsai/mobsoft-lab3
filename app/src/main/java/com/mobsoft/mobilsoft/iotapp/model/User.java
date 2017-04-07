package com.mobsoft.mobilsoft.iotapp.model;

import com.orm.SugarRecord;

/**
 * Created by mobsoft on 2017. 04. 07..
 */

public class User extends SugarRecord {
    private Long id;

    private String username;

    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Long getId(){
        return id;
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }
}
