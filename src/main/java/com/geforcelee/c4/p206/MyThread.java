package com.geforcelee.c4.p206;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/19 下午11:44
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        MyService myService = new MyService();
        myService.waitMethod();
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
