package com.geforcelee.c02.p079;

public class MyThreadB extends Thread {
    private Task task;

    public MyThreadB(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        task.testB();
    }


    public static void main(String[] args) {
        Task task = new Task();
        MyThreadA myThreadA = new MyThreadA(task);
        myThreadA.start();

        MyThreadB myThreadB = new MyThreadB(task);
        myThreadB.start();
    }
}
