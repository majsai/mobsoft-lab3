package com.mobsoft.mobilsoft.iotapp.mock.interceptors;

import android.net.Uri;

import com.mobsoft.mobilsoft.iotapp.network.NetworkConfig;
import com.mobsoft.mobilsoft.iotapp.repository.MemoryRepository;
import com.mobsoft.mobilsoft.iotapp.utils.GsonHelper;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

import static com.mobsoft.mobilsoft.iotapp.mock.interceptors.MockHelper.makeResponse;

/**
 * Created by adam on 2017. 05. 19..
 */

public class AuthMock {
    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();


        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "Auth") && request.method().equals("POST")) {
            responseString = "";
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return makeResponse(request, headers, responseCode, responseString);
    }
}
