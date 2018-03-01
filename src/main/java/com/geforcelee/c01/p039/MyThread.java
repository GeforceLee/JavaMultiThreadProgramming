package com.geforcelee.c01.p039;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午11:38
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            //PrintStream 中的锁未释放 导致 the end 没有打印
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(10);
        thread.suspend();
        System.out.println("the end");
    }
}
