package com.example.administrator.otherpro.otherexercise.dagger2.contract;

import com.example.administrator.otherpro.otherexercise.dagger2.bean.MainModule;
import com.example.administrator.otherpro.otherexercise.dagger2.ui.Daggertest1Activity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @class name：com.example.administrator.otherpro.otherexercise.dagger2.contract
 * @description: ${todo}
 * @anthor syj
 * @time 2019/6/14 14:31
 */

@Singleton
@Component(modules = MainModule.class)
public interface  MainComponent {
    void inject(Daggertest1Activity daggertest1Activity);

}
