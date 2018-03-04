package com.geforcelee.c02.p079;

public class Task {
    public void testA() {
        synchronized (this) {
            System.out.println("A begin");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A end");
        }
    }

    public void testB() {
        synchronized (this) {
            System.out.println("B begin");
            System.out.println("B end");
        }
    }
}
