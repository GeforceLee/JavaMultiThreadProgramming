package com.geforcelee.c4.p207;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/19 下午11:51
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        myThread.start();
        Thread.sleep(1000);
        myService.signal();
    }
}
