package com.geforcelee.c02.p059;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午2:52
 */
public class MyThread extends Thread{
    private MyObject myObject;

    public MyThread(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run(){
        myObject.methodA();
    }

    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();


        MyThread myThread1 = new MyThread(myObject1);
        myThread1.setName("a");
        myThread1.start();

        MyThread myThread2 = new MyThread(myObject1);
        myThread2.setName("b");
        myThread2.start();
    }
}
