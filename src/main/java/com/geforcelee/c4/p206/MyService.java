package com.geforcelee.c4.p206;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/19 下午11:43
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            System.out.println("a");
            condition.await();
            System.out.println("b");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("c");
        }
    }
}
