package com.geforcelee.c01.p044;

import java.util.Random;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/2 下午11:58
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long result = 0;

        for (int i = 0; i < 500000; i++) {
            Random random = new Random();
            result += random.nextInt();
        }
        long end = System.currentTimeMillis();
        System.out.println("thread 1 use time" + (end-begin) + "   " +result);    }
}
