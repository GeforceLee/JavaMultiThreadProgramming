package com.geforcelee.c02.p061;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午3:15
 */
public class MyThreadB extends Thread {
    private MyObject object;

    public MyThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodB();
    }

    public static void main(String[] args) {
        MyObject object = new MyObject();
        MyThreadA myThreadA = new MyThreadA(object);
        myThreadA.start();

        MyThreadB myThreadB = new MyThreadB(object);
        myThreadB.start();

    }
}
