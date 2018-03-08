package com.geforcelee.c03.p139;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/8 下午10:56
 */
public class MyThreadB extends Thread {
    private Object lock;

    public MyThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() ==5) {
                        lock.notify();
                        System.out.println("send notify");
                    }
                    System.out.println("add "+ i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThreadA myThreadA = new MyThreadA(lock);
        myThreadA.start();
        Thread.sleep(500);
        MyThreadB myThreadB = new MyThreadB(lock);
        myThreadB.start();
    }
}
