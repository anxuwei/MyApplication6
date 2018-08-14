package com.example.admin.myapplication.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.myapplication.R;

public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initdate();

    }

    protected abstract void initdate();

    protected abstract int getLayout();
}
