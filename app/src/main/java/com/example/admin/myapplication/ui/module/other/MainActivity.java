package com.example.admin.myapplication.ui.module.other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.admin.myapplication.R;
import com.example.admin.myapplication.base.BaseActivity;
import com.example.admin.myapplication.model.entity.StudentBean;
import com.example.admin.myapplication.ui.module.home.contract.HomeContract;
import com.example.admin.myapplication.ui.module.home.contract.HomePresenter;

public class MainActivity extends BaseActivity implements HomeContract.View {

    private HomeContract.Presenter homePresenter;

    @Override
    protected void initdate() {
        homePresenter = new HomePresenter();
        homePresenter.newList();
        homePresenter.attch(this);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void showNewsList(StudentBean bean) {
        Log.e("AA", bean.getResult().getData().get(0).getAuthor_name());
//      Toast.makeText(this, bean.getResult().getData().get(0).getAuthor_name(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMsg(String msg) {

    }

    @Override
    public void toDetailView() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        homePresenter.docache();
    }
}
