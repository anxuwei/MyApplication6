package com.example.admin.myapplication.model.biz;

import com.example.admin.myapplication.config.Urls;
import com.example.admin.myapplication.model.callback.NetworkCallback;
import com.example.admin.myapplication.model.entity.StudentBean;
import com.example.admin.myapplication.model.http.OkHttpUtils;

public class UserModelImp implements IUsermodel {
    @Override
    public void newList(NetworkCallback<StudentBean> callback) {
        OkHttpUtils.getInstance().doGet(Urls.NEWSLIST, callback);
    }

    @Override
    public void login(String phoneNum, String psw) {

    }
}
