package com.geforcelee.c02.p077;

public class MyThread extends Thread{
    private Task task;

    public MyThread(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }

    public static void main(String[] args) {
        Task task = new Task();
        MyThread myThread1 = new MyThread(task);
        myThread1.start();

        MyThread myThread2 = new MyThread(task);
        myThread2.start();

    }
}
