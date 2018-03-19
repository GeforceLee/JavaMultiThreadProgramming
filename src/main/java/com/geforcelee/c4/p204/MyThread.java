package com.geforcelee.c4.p204;



/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/19 下午11:40
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        MyService myService = new MyService();
        myService.await();
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
