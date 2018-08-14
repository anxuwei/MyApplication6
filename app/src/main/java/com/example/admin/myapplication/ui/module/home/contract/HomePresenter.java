package com.example.admin.myapplication.ui.module.home.contract;

import android.text.TextUtils;

import com.example.admin.myapplication.model.biz.IUsermodel;
import com.example.admin.myapplication.model.biz.UserModelImp;
import com.example.admin.myapplication.model.callback.NetworkCallback;
import com.example.admin.myapplication.model.entity.StudentBean;

/**
 * Created by TMVPHelper on 2018/08/13
 */
public class HomePresenter implements HomeContract.Presenter {

    private final IUsermodel model;
    private HomeContract.View mView;

    public HomePresenter() {
        model = new UserModelImp();
    }

    @Override
    public void newList() {
        model.newList(new NetworkCallback<StudentBean>() {
            @Override
            public void Onsuccess(StudentBean studentBean) {
                if (mView != null)
                    mView.showNewsList(studentBean);
            }

            @Override
            public void OnError(String ErrorMsg) {

            }
        });
    }

    @Override
    public void getpresenter(String phoneNum, String psw) {
        if (!checkphoneNum(phoneNum))
            mView.showMsg("手机号不能为空且长度为11位");
    }

    private Boolean checkphoneNum(String phoneNum) {
        if (!TextUtils.isEmpty(phoneNum) && phoneNum.length() == 11)
            return true;
        return false;
    }

    @Override
    public void attch(HomeContract.View view) {
        this.mView = view;
    }

    @Override
    public void docache() {
        this.mView = null;
    }
}