package com.geforcelee.c01.p029;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/2/28 下午11:49
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了，我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i+1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进入MyThread 类run方法中的catch了");
        }
    }


    public static void main(String[] args) {

        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end !");
    }
}
