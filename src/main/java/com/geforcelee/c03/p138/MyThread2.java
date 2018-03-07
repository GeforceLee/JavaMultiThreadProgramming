package com.geforcelee.c03.p138;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/7 下午10:15
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            System.out.println("开始 notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time=" + System.currentTimeMillis());
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();
        MyThread1 thread1 = new MyThread1(lock);
        thread1.start();
        Thread.sleep(1000);
        MyThread2 thread2 = new MyThread2(lock);
        thread2.start();
    }
}
