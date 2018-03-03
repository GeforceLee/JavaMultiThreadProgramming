package com.geforcelee.c02.p068;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:46
 */
public class Service {
    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName() + "run begintime"
            +System.currentTimeMillis());
            while (true){
                if (("" +Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName = " + Thread.currentThread().getName()
                    + " run exceptiontime=" + System.currentTimeMillis());
                    Integer.parseInt("a");
                }

            }
        }else {
            System.out.println("Thread B run time=" +System.currentTimeMillis());
        }
    }
}
