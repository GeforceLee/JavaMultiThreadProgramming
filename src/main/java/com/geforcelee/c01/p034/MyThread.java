package com.geforcelee.c01.p034;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午9:59
 */
public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }


    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread myThread = new MyThread(object);
            myThread.start();
            Thread.sleep(500);
            myThread.stop();
            System.out.println(object.getUsername() + "  " +object.getPassword());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
