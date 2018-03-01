package com.geforcelee.c01.p031;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午9:42
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i="+ i);
            }
            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        }catch (InterruptedException e) {
            System.out.println("进入 catch");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end !!!");
    }
}
