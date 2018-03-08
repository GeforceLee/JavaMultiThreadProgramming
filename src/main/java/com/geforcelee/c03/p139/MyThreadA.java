package com.geforcelee.c03.p139;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/8 下午10:54
 */
public class MyThreadA extends Thread {
    private Object lock;

    public MyThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                if (MyList.size() != 5) {
                    System.out.println("wait begin");
                    lock.wait();
                    System.out.println("wait end");
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
