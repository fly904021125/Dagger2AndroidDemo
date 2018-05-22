package com.fly.dagger2androiddemo;

/**
 * Created by fly on 2018/4/2.
 */

public class MyInfo {
    private int id;
    private String name;

    public MyInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
