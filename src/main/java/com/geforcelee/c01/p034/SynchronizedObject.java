package com.geforcelee.c01.p034;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/1 下午9:57
 */
public class SynchronizedObject {
    private String username = "a";
    private String password = "aa";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String username,String password){
        try {
            this.username = username;
            Thread.sleep(10000);
            this.password = password;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
