package com.fly.dagger2androiddemo.baseinject;

import android.app.Activity;

import com.fly.dagger2androiddemo.ActivityScope;
import com.fly.dagger2androiddemo.MainActivity;
import com.fly.dagger2androiddemo.SecActivity;
import com.fly.dagger2androiddemo.fastinject.SecModule;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by fly on 2018/4/3.
 */
@Module(subcomponents = MainComponent.class)
public abstract class BuildModule {
    /**
     * 这种方式不能添加scope
     * @param builder
     * @return
     */
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindYourActivityInjectorFactory(MainComponent.Builder builder);

    /**
     * 这种方式可以添加scope
     * @param
     * @return
     */
    @ActivityScope
    @ContributesAndroidInjector(modules = SecModule.class)
    abstract SecActivity contributeSecActivityInjector();
}
