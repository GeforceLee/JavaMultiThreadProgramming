package com.geforcelee.c03.p158;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午2:22
 */
public class ThreadP extends Thread {
    private Object lock;

    public ThreadP(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        P p = new P(lock);
        while (true){
            p.setValue();
        }
    }
}
