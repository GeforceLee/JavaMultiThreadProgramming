package com.geforcelee.c4.p207;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/19 下午11:49
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println(System.currentTimeMillis()+"进入等待");
            condition.await();
            System.out.println(System.currentTimeMillis()+"等待完成");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println(System.currentTimeMillis() +"解锁");
        }
    }


    public void signal(){
        try {
            lock.lock();
            System.out.println(System.currentTimeMillis()+"通知");
            condition.signal();
        }finally {
            lock.unlock();
        }



    }
}
