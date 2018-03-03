package com.geforcelee.c02.p63;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午9:24
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";


    synchronized public void setValue(String username,String password){
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name=" + Thread.currentThread().getName()
             + " username= "+username + " password=" +password);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue method thread name=" + Thread.currentThread().getName()
                + " username= "+username + " password=" +password);
    }
}
