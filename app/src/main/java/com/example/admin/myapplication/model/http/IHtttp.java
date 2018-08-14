package com.example.admin.myapplication.model.http;

import android.widget.ImageView;

import com.example.admin.myapplication.model.callback.NetworkCallback;

import java.io.File;
import java.util.Map;

public interface IHtttp {
    <T> void doGet(String url, NetworkCallback<T> callback);

    //有参的get请求
    <T> void doGet(String url, Map<String, String> params, NetworkCallback<T> callback);

    <T> void doPost(String url, Map<String, String> params, NetworkCallback<T> callback);

    void upload(String url, Map<String, File> files, Map<String, String> params, NetworkCallback<String> callback);

    void download();

    void loadImage(String url, ImageView view);

}
