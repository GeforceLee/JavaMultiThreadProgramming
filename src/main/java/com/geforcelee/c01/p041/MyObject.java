package com.geforcelee.c01.p041;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午11:48
 */
public class MyObject {
    private String username = "1";
    private String password = "11";
    public void setValue(String u,String p){
        this.username = u;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("暂停a线程");
            Thread.currentThread().suspend();;
        }
        this.password = p;
    }

    public void printUsernamePassword(){
        System.out.println(username + " " + password);
    }


    public static void main(String[] args) throws InterruptedException {
        final MyObject object = new MyObject();
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                object.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                object.printUsernamePassword();
            }
        };
        thread2.start();
        Thread.sleep(500);
        thread1.resume();
    }
}
