package com.geforcelee.c03.p138;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/7 下午10:13
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("开始 wait time="+System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time="+System.currentTimeMillis());
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
