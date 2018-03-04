package com.geforcelee.c02.p077;

public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i ="+i);
        }
        System.out.println("-------");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i ="+i);

            }
        }
    }
}
