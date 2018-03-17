package com.geforcelee.c03.p147;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:12
 */
public class MyThread extends Thread {
    private Object lock;

    public MyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.test(lock);
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread myThread = new MyThread(lock);
        myThread.start();
        Thread.sleep(5000);
        myThread.interrupt();



    }
}
