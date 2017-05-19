package com.mobsoft.mobilsoft.iotapp.mock;

import com.mobsoft.mobilsoft.iotapp.mock.interceptors.MockInterceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by adam on 2017. 05. 19..
 */

public class MockHttpServer {
    public static Response call(Request request) {
        MockInterceptor mockInterceptor = new MockInterceptor();
        return mockInterceptor.process(request);
    }
}
