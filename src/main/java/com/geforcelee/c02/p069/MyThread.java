package com.geforcelee.c02.p069;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:58
 */
public class MyThread extends Thread{
    private Sub sub;

    public MyThread(Sub sub) {
        super();
        this.sub = sub;
    }


    @Override
    public void run() {
        try {
            sub.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Sub sub = new Sub();

        MyThread myThread1 = new MyThread(sub);
        myThread1.start();

        MyThread myThread2 = new MyThread(sub);
        myThread2.start();
    }
}
