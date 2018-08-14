package com.example.admin.myapplication.model.biz;

import com.example.admin.myapplication.model.callback.NetworkCallback;
import com.example.admin.myapplication.model.entity.StudentBean;

public interface IUsermodel {
    void newList(NetworkCallback<StudentBean> callback);

    void login(String phoneNum, String psw);
}
