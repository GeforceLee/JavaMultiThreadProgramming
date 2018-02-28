package com.geforcelee.c01.p019;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/2/28 下午11:25
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("MyThread Start");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("MyThread End");
    }


    @Override
    public void run() {
        System.out.println("run start");

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("run end");
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        System.out.println("Main begin thread isAlive=" +thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end thread isAlive=" + thread.isAlive());
    }
}
