package com.geforcelee.c02.p055;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午2:31
 */
public class MyThread1 extends Thread {
    private HasSelfPrivateNum privateNum;

    public MyThread1(HasSelfPrivateNum privateNum) {
        super();
        this.privateNum = privateNum;
    }


    @Override
    public void run() {
        privateNum.addI("a");
    }

}
