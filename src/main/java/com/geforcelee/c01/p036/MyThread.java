package com.geforcelee.c01.p036;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午10:55
 */
public class MyThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }


    @Override
    public void run() {
        while (true) {
            i++;
        }
    }


    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("A = " +System.currentTimeMillis() + " i= "+thread.getI());
            Thread.sleep(5000);
            System.out.println("A = " +System.currentTimeMillis() + " i= "+thread.getI());

            thread.resume();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("B = " +System.currentTimeMillis() + " i= "+thread.getI());
            Thread.sleep(5000);
            System.out.println("B = " +System.currentTimeMillis() + " i= "+thread.getI());




        }catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
