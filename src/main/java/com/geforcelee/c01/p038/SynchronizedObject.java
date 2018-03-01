package com.geforcelee.c01.p038;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午11:08
 */
public class SynchronizedObject {

    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a 线程永远 suspend了!");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }


    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(){
                @Override
                public void run(){
                    System.out.println("thread2 启动了");
                    object.printString();
                }
            };
            thread2.start();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
