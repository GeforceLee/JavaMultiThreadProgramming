package com.geforcelee.c02.p059;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午2:52
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
