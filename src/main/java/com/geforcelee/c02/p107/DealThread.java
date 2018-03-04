package com.geforcelee.c02.p107;

public class DealThread implements Runnable {
    private String name;

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (name.equals("a")){
            synchronized (lock1) {
                System.out.println("name = " +name);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("lock1 -> lock2");
                }
            }
        }else {
            synchronized (lock2) {
                System.out.println("name = " +name);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("lock2 -> lock1");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DealThread d1 = new DealThread();
        d1.setName("a");
        Thread thread = new Thread(d1);
        thread.start();
        Thread.sleep(100);
        d1.setName("b");
        Thread thread1 = new Thread(d1);
        thread1.start();
    }
}
