package com.geforcelee.c03.p181;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午9:59
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("Thread B run end");
        }catch (InterruptedException e){
            System.out.println("B exception");
            e.printStackTrace();
        }

    }
}
