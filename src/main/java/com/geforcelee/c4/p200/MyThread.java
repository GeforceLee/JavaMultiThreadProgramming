package com.geforcelee.c4.p200;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/18 下午11:10
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }


    @Override
    public void run() {
        myService.testMethod();
    }


    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(myService);
            myThread.start();
        }
    }
}
