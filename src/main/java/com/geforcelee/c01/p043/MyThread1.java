package com.geforcelee.c01.p043;


/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/2 下午11:48
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }

    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
