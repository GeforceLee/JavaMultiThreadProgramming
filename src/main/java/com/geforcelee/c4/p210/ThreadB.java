package com.geforcelee.c4.p210;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 上午10:03
 */
public class ThreadB extends Thread {

    public MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }


    @Override
    public void run() {
        myService.awaitB();
    }


    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        ThreadA a = new ThreadA(myService);
        a.start();

        ThreadB b = new ThreadB(myService);
        b.start();

        Thread.sleep(3000);
        myService.signalAllA();

    }

}
