package com.geforcelee.c03.p137;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/7 下午10:09
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String();
        System.out.println("sync 上面");
        synchronized (lock) {
            System.out.println("sync first");
            lock.wait();
            System.out.println("sync end");
        }
        System.out.println("sunc 下面");
    }
}
