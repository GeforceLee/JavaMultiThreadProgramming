package com.geforcelee.c4.p202;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/18 下午11:19
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }


    @Override
    public void run() {
        myService.testA();
    }
}
