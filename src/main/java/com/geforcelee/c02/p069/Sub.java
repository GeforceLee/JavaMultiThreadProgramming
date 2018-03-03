package com.geforcelee.c02.p069;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:57
 */
public class Sub extends Main {

    @Override
    public void test() throws InterruptedException {
        System.out.println("Sub ThreadName=" +Thread.currentThread().getName() + " Start");
        Thread.sleep(5000);
        System.out.println("Sub ThreadName=" +Thread.currentThread().getName() + " End");
        super.test();
    }



}
