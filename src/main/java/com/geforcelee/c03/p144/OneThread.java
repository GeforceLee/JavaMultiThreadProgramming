package com.geforcelee.c03.p144;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/8 下午11:21
 */
public class OneThread extends Thread {
    private Object lock;

    public OneThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synMethod(lock);
    }

    public static void main(String[] args) {
        Object lock = new Object();

        MyThread myThread = new MyThread(lock);
        myThread.start();

        OneThread oneThread = new OneThread(lock);
        oneThread.start();

        OneThread oneThread1 = new OneThread(lock);
        oneThread1.start();
    }
}
