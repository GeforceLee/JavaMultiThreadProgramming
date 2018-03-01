package com.geforcelee.c01.p030;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午9:35
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}
