package com.fly.dagger2androiddemo.baseinject;

import com.fly.dagger2androiddemo.ActivityScope;
import com.fly.dagger2androiddemo.MyInfo;

import dagger.Module;
import dagger.Provides;

/**
 * 该Module不由ApplicationComponent使用，所以不受ApplicationComponent的Scope限制
 * 该Module由MainComponent使用，所以受MainComponent的Scope限制
 * MainComponent是ApplicationComponent的Subcomponent，在BuildModule中定义
 * Created by fly on 2018/4/2.
 */
@Module
public abstract class MainModule {
    @ActivityScope
    @Provides
    public static MyInfo provideMyInfo() {
        return new MyInfo(1, "Michael");
    }


}
