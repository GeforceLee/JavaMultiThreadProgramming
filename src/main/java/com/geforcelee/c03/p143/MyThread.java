package com.geforcelee.c03.p143;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/8 下午11:11
 */
public class MyThread extends Thread{
    private Object lock;

    public MyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.test(lock);
    }


    public static void main(String[] args) {
        Object lock = new Object();
        MyThread myThread1 = new MyThread(lock);
        myThread1.start();

        MyThread myThread2 = new MyThread(lock);
        myThread2.start();
    }
}
