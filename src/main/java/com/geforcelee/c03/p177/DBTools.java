package com.geforcelee.c03.p177;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午7:12
 */
public class DBTools {

    private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("----------------");
            }
            prevIsA = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    synchronized public void backupB() {
        try {
            while (!prevIsA){
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("***************");
            }
            prevIsA = false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public static class BackA extends Thread{
        private DBTools dbTools;

        public BackA(DBTools dbTools) {
            this.dbTools = dbTools;
        }

        @Override
        public void run() {
            dbTools.backupA();
        }
    }
    public static class BackB extends Thread{
        private DBTools dbTools;

        public BackB(DBTools dbTools) {
            this.dbTools = dbTools;
        }

        @Override
        public void run() {
            dbTools.backupB();
        }
    }

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackB b = new BackB(dbTools);
            b.start();
            BackA a = new BackA(dbTools);
            a.start();
        }
    }

}
