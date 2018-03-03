package com.geforcelee.c02.p069;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:56
 */
public class Main {

    synchronized public void test() throws InterruptedException {
        System.out.println("Main ThreadName=" +Thread.currentThread().getName() + " Start");
        Thread.sleep(5000);
        System.out.println("Main ThreadName=" +Thread.currentThread().getName() + " End");
    }
}
