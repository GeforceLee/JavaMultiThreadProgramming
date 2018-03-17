package com.geforcelee.c03.p180;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午9:51
 */
public class MyThread extends Thread {



    @Override
    public void run() {

        try {
            int secondValue = (int) (Math.random() *10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
            System.out.println("wanchengle ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("aaaa");
    }
}
