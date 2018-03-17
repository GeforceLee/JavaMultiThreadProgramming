package com.geforcelee.c03.p160;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午5:08
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }


    @Override
    public void run() {
        while (true){
            c.getValue();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        P p = new P(lock);
        C c = new C(lock);
        for (int i = 0; i < 2; i++) {
            ThreadP threadP = new ThreadP(p);
            threadP.setName("生产者"+i);
            threadP.start();
            ThreadC threadC = new ThreadC(c);
            threadC.setName("消费者"+i);
            threadC.start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i] + " " + threads[i].getState());
        }
    }
}
