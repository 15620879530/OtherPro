package com.example.administrator.otherpro.otherexercise.dagger2.ui;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.otherpro.R;
import com.example.administrator.otherpro.otherexercise.dagger2.bean.MainModule;
import com.example.administrator.otherpro.otherexercise.dagger2.bean.Student;
import com.example.administrator.otherpro.otherexercise.dagger2.contract.DaggerMainComponent;

import javax.inject.Inject;

/**
 * @class name：com.example.administrator.otherpro.otherexercise.dagger2.ui
 * @description: ${todo}
 * @anthor syj
 * @time 2019/6/14 13:48
 */


public class Daggertest1Activity extends AppCompatActivity{
    @Inject
    Student mStudent;  // 注入Studnet的实例

    private TextView tv_mess;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deggertes1);
        tv_mess = findViewById(R.id.text);
        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build()
                .inject(this);
        tv_mess.setText(mStudent.showMessage());


    }
}
