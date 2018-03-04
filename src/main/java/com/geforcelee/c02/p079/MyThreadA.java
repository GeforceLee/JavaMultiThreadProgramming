package com.geforcelee.c02.p079;

public class MyThreadA extends Thread{
    private Task task;

    public MyThreadA(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        task.testA();
    }
}
