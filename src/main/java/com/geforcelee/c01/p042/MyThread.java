package com.geforcelee.c01.p042;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/2 下午11:12
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
            Thread.yield();
            count = count + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时： "+ (endTime-beginTime) + " 毫秒");
    }


    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
