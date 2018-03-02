package com.geforcelee.c01.p044;

import java.util.Random;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 上午12:00
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long result = 0;

        for (int i = 0; i < 500000; i++) {
            Random random = new Random();
            result += random.nextInt();
        }
        long end = System.currentTimeMillis();
        System.out.println("thread 2 use time" + (end-begin) + "   " +result);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            myThread1.start();

            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(10);
            myThread2.start();
        }
    }
}
