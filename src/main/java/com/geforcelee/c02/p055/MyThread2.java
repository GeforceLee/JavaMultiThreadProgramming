package com.geforcelee.c02.p055;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午2:32
 */
public class MyThread2 extends Thread {
    private HasSelfPrivateNum privateNum;

    public MyThread2(HasSelfPrivateNum privateNum) {
        super();
        this.privateNum = privateNum;

    }

    @Override
    public void run() {
        privateNum.addI("b");
    }


    public static void main(String[] args) {
        HasSelfPrivateNum privateNum = new HasSelfPrivateNum();
        MyThread1 myThread1 = new MyThread1(privateNum);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(privateNum);
        myThread2.start();
    }
}
