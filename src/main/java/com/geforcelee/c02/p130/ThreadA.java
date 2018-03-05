package com.geforcelee.c02.p130;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }


    @Override
    public void run() {
        service.runMethod();
    }
}
