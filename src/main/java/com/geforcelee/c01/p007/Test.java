package com.geforcelee.c01.p007;

public class Test {
    public static void main(String[] args) {
//        for (int i = 0; i < 13; i++) {
//            MyThread myThread = new MyThread(i);
//            myThread.start();
//        }
        MyThread myThread1 = new MyThread(1);
        MyThread myThread2 = new MyThread(2);
        MyThread myThread3 = new MyThread(3);
        MyThread myThread4 = new MyThread(4);
        MyThread myThread5 = new MyThread(5);
        MyThread myThread6 = new MyThread(6);
        MyThread myThread7 = new MyThread(7);
        MyThread myThread8 = new MyThread(8);
        MyThread myThread9 = new MyThread(9);
        MyThread myThread10 = new MyThread(10);
        MyThread myThread11 = new MyThread(11);
        MyThread myThread12 = new MyThread(12);
        MyThread myThread13 = new MyThread(13);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread10.start();
        myThread11.start();
        myThread12.start();
        myThread13.start();
    }
}
