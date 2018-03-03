package com.geforcelee.c02.p066;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:42
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
