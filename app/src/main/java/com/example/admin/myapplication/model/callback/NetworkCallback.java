package com.example.admin.myapplication.model.callback;

public interface NetworkCallback<T> {
    void Onsuccess(T t);

    void OnError(String ErrorMsg);
}
