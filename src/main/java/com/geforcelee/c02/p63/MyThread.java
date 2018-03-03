package com.geforcelee.c02.p63;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:27
 */
public class MyThread extends Thread {
    private PublicVar publicVar;

    public MyThread(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue("b","bb");
    }


    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        MyThread myThread = new MyThread(publicVar);
        myThread.start();
        Thread.sleep(200);
        publicVar.getValue();

    }
}
