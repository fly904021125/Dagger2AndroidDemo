package com.fly.dagger2androiddemo.fastinject;

import com.fly.dagger2androiddemo.MyInfo;
import com.fly.dagger2androiddemo.SecActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**该Module直接由ApplicationComponent使用，所以受ApplicationComponent的Scope限制
 * Created by fly on 2018/4/3.
 */

@Module
public abstract class SecModule {
//    @ContributesAndroidInjector
//    abstract SecActivity contributeSecActivityInjector();

    @Named(value = "ke")
    @Provides
    public static MyInfo provideInfo(){
        return new MyInfo(10,"King");
    }
}
