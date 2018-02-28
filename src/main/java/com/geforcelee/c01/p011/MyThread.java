/**
 * Copyright (C), 2018, GeforceLee
 * Author:   geforce
 * Date:     2018/2/28 下午10:50
 */
package com.geforcelee.c01.p011;

/**
 * 共享数据
 */
public class MyThread extends Thread {

    private int count = 5;

    @Override
    public void run() {
        super.run();
        /* 1.取得id值
           2.计算i-1
           3.对进行赋值
         */
        count--;

        System.out.println("由 " + currentThread().getName() + " 计算，count=" + count);
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
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
