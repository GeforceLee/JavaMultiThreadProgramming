package com.geforcelee.c01.p011;

/**
 * Copyright (C), 2018, GeforceLee
 * Author:   geforce
 * Date:     2018/2/28 下午11:01
 */
public class MySafeThread extends Thread{
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + currentThread().getName() + " 计算，count=" + count);

    }

    public static void main(String[] args) {
        MySafeThread myThread = new MySafeThread();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
