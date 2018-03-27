package com.geforcelee.c4.p224;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/27 下午11:17
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFire) {
        this.lock = new ReentrantLock(isFire);
    }


    public void sesrviceMethod() {
        try {
            lock.lock();
            System.out.println(lock.isFair());
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            public void run() {
                service1.sesrviceMethod();
            }
        };


        Thread thread = new Thread(runnable);
        thread.start();

        final Service service2 = new Service(false);
        runnable = new Runnable() {
            public void run() {
                service2.sesrviceMethod();
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();


    }
}
