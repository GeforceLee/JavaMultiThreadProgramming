package com.geforcelee.c02.p066;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:39
 */
public class Main {
    public int i = 10;

    synchronized public void operateIMainMethod(){
        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
