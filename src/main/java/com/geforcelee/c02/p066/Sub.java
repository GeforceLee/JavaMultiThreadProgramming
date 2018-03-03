package com.geforcelee.c02.p066;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:40
 */
public class Sub extends Main {

    synchronized public void operateISubMethod() {
        try {
            for (int i1 = 0; i1 < 10; i1++) {
                i--;
                System.out.println("sub method i=" +i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
