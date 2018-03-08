package com.geforcelee.c03.p143;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/8 下午11:10
 */
public class Service {
    public void test(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait");
                lock.wait();
                System.out.println("end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
