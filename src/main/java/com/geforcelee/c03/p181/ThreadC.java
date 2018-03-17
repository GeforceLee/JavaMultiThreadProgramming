package com.geforcelee.c03.p181;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午10:02
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }


    @Override
    public void run() {
        threadB.interrupt();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        Thread.sleep(500);

        ThreadC threadC = new ThreadC(threadB);
        threadC.start();
    }
}
