package com.example.admin.myapplication.ui.module.home.contract;

import com.example.admin.myapplication.base.BasePresenter;
import com.example.admin.myapplication.model.entity.StudentBean;

public class HomeContract {

    public interface View {
        void showNewsList(StudentBean bean);

        void showMsg(String msg);

        void toDetailView();
    }

    public interface Presenter extends BasePresenter<View> {
        void newList();

        void getpresenter(String phoneNum, String psw);
    }
}