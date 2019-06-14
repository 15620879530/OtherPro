package com.example.administrator.otherpro.otherexercise.dagger2.bean;

import javax.inject.Inject;

/**
 * @class name：com.example.administrator.otherpro.otherexercise.dagger2.bean
 * @description: ${todo}
 * @anthor syj
 * @time 2019/6/14 13:46
 */


public class Student {

    private String mess="Student的实例是注解方式注入的!";

    @Inject
    public Student(){

    }

    public String showMessage(){
        return mess;
    }
}
