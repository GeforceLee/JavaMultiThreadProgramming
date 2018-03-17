package com.geforcelee.c03.p148;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:42
 */
public class ThreadC extends Thread {

    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        ThreadA thread1 = new ThreadA(lock);
        thread1.start();

        ThreadA thread2 = new ThreadA(lock);
        thread2.start();

        ThreadA thread3 = new ThreadA(lock);
        thread3.start();

        Thread.sleep(2000);


        ThreadC threadC = new ThreadC(lock);
        threadC.start();


    }
}
