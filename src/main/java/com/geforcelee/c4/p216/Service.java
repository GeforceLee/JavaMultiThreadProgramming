package com.geforcelee.c4.p216;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 下午5:13
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("Thread Name= "+ Thread.currentThread().getName() + " 获得了锁");
        }finally {
            lock.unlock();
        }
    }



    public static void runFair(boolean isFair) {
        final Service service = new Service(isFair);
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("线程" + Thread.currentThread().getName() + " 运行了");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.setName(""+i);
            threads[i] = thread;
        }

        for (int i = 0; i < 10; i++) {
            Thread thread = threads[i];
            thread.start();
        }
    }


    public static void main(String[] args) {
        runFair(true);
    }


}
