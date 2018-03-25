package com.geforcelee.c4.p213;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 上午10:16
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            myService.set();
        }

    }


    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 10; i++) {
            ThreadA a = new ThreadA(myService);
            a.start();
            ThreadB b = new ThreadB(myService);
            b.start();
        }
    }
}
