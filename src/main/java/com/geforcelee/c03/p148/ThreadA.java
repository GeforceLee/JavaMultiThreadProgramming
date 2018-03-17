package com.geforcelee.c03.p148;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:23
 */
public class ThreadA extends Thread {

    private Object lock;

    public Object getLock() {
        return lock;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.test(lock);
    }
}
