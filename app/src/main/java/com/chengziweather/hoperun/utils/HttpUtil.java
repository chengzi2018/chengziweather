package com.chengziweather.hoperun.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by hoperun on 18-4-20.
 */
//用于和服务器进行交互
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
