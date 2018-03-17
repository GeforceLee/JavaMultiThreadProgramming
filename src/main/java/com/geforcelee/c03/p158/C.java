package com.geforcelee.c03.p158;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午2:20
 */
public class C {
    private Object lock;

    public C(Object lock) {
        this.lock = lock;
    }


    public void getValue(){
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get值是："+ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
