package com.geforcelee.c4.p220;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 下午5:36
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " enter");
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.serviceMethod1();
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.setName(""+i);
            threads[i] = thread;
        }

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();

        }
        Thread.sleep(1000);
        System.out.println(service.lock.getQueueLength());
    }
}
