package com.geforcelee.c03.p148;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:24
 */
public class ThreadB extends ThreadA {


    public ThreadB(Object lock) {
        super(lock);
    }


    @Override
    public void run() {
        synchronized (this.getLock()){
            this.getLock().notify();
            this.getLock().notify();
            this.getLock().notify();
            this.getLock().notify();
            this.getLock().notify();
            this.getLock().notify();
            this.getLock().notify();
            this.getLock().notify();
        }

    }


    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        ThreadA threadA1 = new ThreadA(lock);
        threadA1.start();

        ThreadA threadA2 = new ThreadA(lock);
        threadA2.start();
        Thread.sleep(1000);


        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }

}
