package com.geforcelee.c03.p147;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:11
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
            System.out.println("catch error");
        }

    }
}
