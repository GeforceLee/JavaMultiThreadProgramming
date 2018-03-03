package com.geforcelee.c01.p050;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午1:43
 */
public class MyThread extends Thread {
    private long count = 0;

    @Override
    public void run(){
        try {
            while (true) {
                count++;
                System.out.println("Thread:"+this.getName() + "  count="+count);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        myThread1.setName("a");
        myThread1.setDaemon(true);
        myThread1.start();

//        MyThread myThread2 = new MyThread();
//        myThread2.setName("b");
//        myThread2.start();
        Thread.sleep(5000);
        System.out.println("main end");
    }
}
