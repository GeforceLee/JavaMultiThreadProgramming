package com.geforcelee.c03.p148;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:22
 */
public class Service {

    public void test(Object lock){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + " begin wait");
                lock.wait();
                System.out.println(Thread.currentThread().getName() + " end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
