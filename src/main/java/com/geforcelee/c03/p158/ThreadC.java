package com.geforcelee.c03.p158;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午2:24
 */
public class ThreadC extends Thread {

    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        C c = new C(lock);
        while (true){
            c.getValue();
        }
    }


    public static void main(String[] args) {
        Object o = new Object();

        ThreadP threadP = new ThreadP(o);
        threadP.start();

        ThreadC threadC = new ThreadC(o);
        threadC.start();
    }
}
