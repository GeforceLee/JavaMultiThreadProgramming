package com.geforcelee.c03.p187;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午10:24
 */
public class ThreadA extends Thread {
    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }


    @Override
    public void run() {
        try {
            synchronized (threadB){
                System.out.println("A start:" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("A end:" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
