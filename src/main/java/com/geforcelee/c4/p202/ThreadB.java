package com.geforcelee.c4.p202;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/18 下午11:19
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }


    @Override
    public void run() {
        myService.testB();
    }


    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();

        ThreadA threadA1 = new ThreadA(myService);
        threadA1.start();

        Thread.sleep(100);


        ThreadB threadB = new ThreadB(myService);
        threadB.start();

        ThreadB threadB1 = new ThreadB(myService);
        threadB1.start();
    }
}
