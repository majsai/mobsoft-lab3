package com.mobsoft.mobilsoft.iotapp.network.node;

/**
 * Created by adam on 2017. 05. 19..
 */

import com.mobsoft.mobilsoft.iotapp.model.SensorNode;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.*;

public interface NodeApi {

    @POST("Node")
    Call<Void> nodeCreate(
            @Body SensorNode data
    );

    @GET("Node")
    Call<List<SensorNode>> getNodes();
}
