package com.example.admin.myapplication.model.biz;

import com.example.admin.myapplication.model.entity.StudentBean;

import rx.Observable;

public interface MineService {
    Observable<StudentBean> userinfo();
}
