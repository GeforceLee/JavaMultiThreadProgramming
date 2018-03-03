package com.geforcelee.c02.p053;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午2:04
 */
public class HasSelfPrivateNum {
    public void addI(String u) {
        try {
            int num = 0;
            if (u.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(1000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(u + " num="+ num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
