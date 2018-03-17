package com.geforcelee.c03.p187;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午10:24
 */
public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        try {
            System.out.println("B start:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("B end:" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);
        threadA.start();
        threadB.start();
        threadB.join(2000);
        System.out.println("main end");
    }
}
