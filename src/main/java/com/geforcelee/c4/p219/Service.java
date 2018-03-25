package com.geforcelee.c4.p219;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/25 下午5:26
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("1 getHoldCount=" + lock.getHoldCount());
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }


    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("2 getHoldCount=" + lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
    }
}
