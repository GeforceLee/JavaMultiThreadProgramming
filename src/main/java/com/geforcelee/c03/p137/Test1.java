package com.geforcelee.c03.p137;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/7 下午10:08
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String s = new String("");
            s.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
