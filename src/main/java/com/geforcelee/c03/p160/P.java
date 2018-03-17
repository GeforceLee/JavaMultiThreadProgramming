package com.geforcelee.c03.p160;

import com.geforcelee.c03.p158.ValueObject;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午4:17
 */
public class P {
    private Object lock;

    public P(Object lock) {
        this.lock = lock;
    }


    public void setValue(){
        try {
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("生产者" +Thread.currentThread().getName() + "begin wati");
                    lock.wait();
                    System.out.println("生产者" +Thread.currentThread().getName() + "end wati");
                }
                System.out.println("生产者" +Thread.currentThread().getName() + " 生产值");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();

                ValueObject.value = value;
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
