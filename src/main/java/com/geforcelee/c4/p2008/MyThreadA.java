package com.geforcelee.c4.p2008;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/24 下午11:10
 */
public class MyThreadA extends Thread{

    private MyService myService;


    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
