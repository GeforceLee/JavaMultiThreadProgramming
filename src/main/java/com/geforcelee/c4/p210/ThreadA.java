package com.geforcelee.c4.p210;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 上午10:02
 */
public class ThreadA extends Thread {
    private MyService myService;


    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
