package com.geforcelee.c02.p061;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午3:13
 */
public class MyObject {

    synchronized public void methodA() {
        try {
            System.out.println("methodA start");
            Thread.sleep(5000);
            System.out.println("methodA end");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB() {
        try {
            System.out.println("methodB start");
            Thread.sleep(5000);
            System.out.println("methodB end");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
