package com.geforcelee.c02.p124;

public class MyThread extends Thread {
    volatile private static int count = 0;

    synchronized private static void addCount() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
        System.out.println("count = "+ count);
    }

    @Override
    public void run() {
        addCount();
    }


    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }

        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
