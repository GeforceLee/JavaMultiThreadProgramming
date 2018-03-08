package com.geforcelee.c03.p144;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/8 下午11:18
 */
public class Service {
    public void test(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait111");
                lock.wait();
                System.out.println("end wait1111");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void synMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end notify");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
