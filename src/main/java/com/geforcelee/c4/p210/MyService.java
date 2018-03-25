package com.geforcelee.c4.p210;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 上午9:53
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();


    public void awaitA() {
        try {
            lock.lock();
            System.out.println("awaitA start "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());
            conditionA.await();
            System.out.println("awaitA end "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void awaitB() {
        try {
            lock.lock();
            System.out.println("awaitB start "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());
            conditionB.await();
            System.out.println("awaitB end "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            lock.unlock();
        }
    }



    public void signalAllA() {
        try {
            lock.lock();
            System.out.println("signalAllA start "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());
            conditionA.signalAll();
            System.out.println("signalAllA end "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());

        }finally {
            lock.unlock();
        }
    }


    public void singalAllB() {
        try {
            lock.lock();
            System.out.println("signalAllB start "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());
            conditionB.signalAll();
            System.out.println("signalAllB end "+ System.currentTimeMillis() + " ThreadName="+Thread.currentThread().getName());
        }finally {
            lock.unlock();
        }
    }
}
