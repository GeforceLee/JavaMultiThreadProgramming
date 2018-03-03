package com.geforcelee.c02.p061;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午3:15
 */
public class MyThreadA extends Thread {
    private MyObject object;

    public MyThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.methodA();
    }
}
