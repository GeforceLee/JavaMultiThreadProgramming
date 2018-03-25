package com.geforcelee.c4.p221;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 下午5:53
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    private void notifyMethod() {
        try {
            lock.lock();
            System.out.println(lock.getWaitQueueLength(condition));
            condition.signal();
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
        Thread.sleep(2000);
        service.notifyMethod();

    }
}
