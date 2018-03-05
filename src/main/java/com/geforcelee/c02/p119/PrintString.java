package com.geforcelee.c02.p119;

public class PrintString implements Runnable{
    boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }


    @Override
    public void run() {
        while (isContinuePrint) {
            System.out.println(System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程停止了");
    }


    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        new Thread(printString).start();
//        thread.start();
        Thread.sleep(1000);
        printString.setContinuePrint(false);
        System.out.println("main end");
    }
}
