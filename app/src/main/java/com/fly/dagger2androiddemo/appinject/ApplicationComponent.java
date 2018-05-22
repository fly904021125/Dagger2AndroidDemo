package com.fly.dagger2androiddemo.appinject;

import com.fly.dagger2androiddemo.MyApplication;
import com.fly.dagger2androiddemo.baseinject.BuildModule;
import com.fly.dagger2androiddemo.fastinject.SecModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by fly on 2018/4/2.
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, BuildModule.class})
public interface ApplicationComponent extends AndroidInjector<MyApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {
    }
}
