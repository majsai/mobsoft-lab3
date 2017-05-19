package com.mobsoft.mobilsoft.iotapp.network.auth;

/**
 * Created by adam on 2017. 05. 19..
 */

import com.mobsoft.mobilsoft.iotapp.model.User;

import retrofit2.Call;
import retrofit2.http.*;

public interface AuthApi {

    @POST("Auth")
    Call<Void> userAuth(
            @Body User data
    );
}
