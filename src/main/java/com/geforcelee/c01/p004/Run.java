package com.geforcelee.c01.p004;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("game over");
    }
}
