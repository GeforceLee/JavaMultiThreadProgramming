package com.geforcelee.c03.p151;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:45
 */
public class MyRunnable {

    static private Object lock = new Object();

    static private Runnable runnable = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println(System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println(System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };


    static private Runnable runnable2 = new Runnable() {
        public void run() {

            synchronized (lock) {
                lock.notifyAll();
            }

        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(2000);

        Thread thread1 = new Thread(runnable2);
        thread1.start();
    }
}
