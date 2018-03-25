package com.geforcelee.c4.p208;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/24 下午11:10
 */
public class MyThreadB extends Thread{

    private MyService myService;


    public MyThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }


    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        MyThreadA myThreadA = new MyThreadA(myService);
        myThreadA.setName("A");
        myThreadA.start();


        MyThreadB myThreadB = new MyThreadB(myService);
        myThreadB.setName("A");
        myThreadB.start();

        Thread.sleep(100);

        myService.signalAll();
    }
}
