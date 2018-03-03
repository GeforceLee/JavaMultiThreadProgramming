package com.geforcelee.c02.p055;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午2:14
 */
public class HasSelfPrivateNum {
    private int num = 0;

    synchronized public void addI(String u) {
        try {
            if (u.equals("a")) {
                num = 100;
                System.out.println("a set num over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set num over");
            }

            System.out.println(u + " num=" +num);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
