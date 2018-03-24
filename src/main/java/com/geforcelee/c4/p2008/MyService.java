package com.geforcelee.c4.p2008;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/24 下午11:07
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();


    public void awaitA() {
        try {
            lock.lock();
            System.out.println("awaitA "+System.currentTimeMillis() + " " + Thread.currentThread().getName());

            condition.await();

            System.out.println("awaitA "+System.currentTimeMillis() + " " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    public void awaitB() {
        try {
            lock.lock();
            System.out.println("awaitB "+System.currentTimeMillis() + " " + Thread.currentThread().getName());
            condition.await();
            System.out.println("awaitB "+System.currentTimeMillis() + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void signalAll() {

        try {
            lock.lock();
            System.out.println("signalAll "+System.currentTimeMillis() + " " + Thread.currentThread().getName());
            condition.signalAll();
        }finally {
            lock.unlock();

        }
    }
}
