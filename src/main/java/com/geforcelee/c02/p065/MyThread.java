package com.geforcelee.c02.p065;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:35
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
