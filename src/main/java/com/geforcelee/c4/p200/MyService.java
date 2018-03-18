package com.geforcelee.c4.p200;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/18 下午11:09
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName" + Thread.currentThread().getName() + " i = "+ i);
        }
        lock.unlock();
    }
}
