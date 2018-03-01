package com.geforcelee.c01.p035;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午10:04
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer" + System.currentTimeMillis());
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(1000);
        myThread.interrupt();
    }
}
