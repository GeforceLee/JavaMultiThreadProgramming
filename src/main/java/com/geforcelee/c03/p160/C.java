package com.geforcelee.c03.p160;

import com.geforcelee.c03.p158.ValueObject;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午4:48
 */
public class C {
    private Object lock;

    public C(Object lock) {
        this.lock = lock;
    }


    public void getValue(){
        try {
            synchronized (lock){
                while (ValueObject.value.equals("")){
                    System.out.println("消费者" +Thread.currentThread().getName() + "begin wat");
                    lock.wait();
                    System.out.println("消费者" +Thread.currentThread().getName() + "end wat");
                }
                System.out.println("消费者" +Thread.currentThread().getName() + "get value");
                ValueObject.value = "";
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
