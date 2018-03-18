package com.geforcelee.c4.p202;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/18 下午11:17
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testA(){


        try {
            lock.lock();
            System.out.println("Test A start " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("Test A end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public void testB(){
        try {
            lock.lock();
            System.out.println("Test B start " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("Test B end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
