package com.geforcelee.c02.p130;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(1000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        System.out.println("end");
    }

}
