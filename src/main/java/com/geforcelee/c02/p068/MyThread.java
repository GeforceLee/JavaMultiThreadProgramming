package com.geforcelee.c02.p068;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:50
 */
public class MyThread extends Thread{
    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }


    public static void main(String[] args) {
        Service service = new Service();

        MyThread myThread1 = new MyThread(service);
        myThread1.setName("a");
        myThread1.start();

        MyThread myThread2 = new MyThread(service);
        myThread2.start();

    }
}
