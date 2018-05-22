package com.fly.dagger2androiddemo.baseinject;

import com.fly.dagger2androiddemo.ActivityScope;
import com.fly.dagger2androiddemo.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by fly on 2018/4/2.
 */
@ActivityScope
@Subcomponent(modules = MainModule.class)
public interface MainComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}
