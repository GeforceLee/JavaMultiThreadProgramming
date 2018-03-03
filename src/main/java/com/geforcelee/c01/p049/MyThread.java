package com.geforcelee.c01.p049;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午1:35
 */
public class MyThread extends Thread {
    private long count = 0;

    public long getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        myThread1.setPriority(Thread.NORM_PRIORITY-3);
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.setPriority(Thread.NORM_PRIORITY+3);
        myThread2.start();
        Thread.sleep(10000);
        myThread1.stop();
        myThread2.stop();
        System.out.println("myThread1 count=" +myThread1.getCount());
        System.out.println("myThread2 count=" +myThread2.getCount());
    }
}
