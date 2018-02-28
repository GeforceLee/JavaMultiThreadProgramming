package com.geforcelee.c01.p012;

/**
 * Copyright (C), 2018, GeforceLee
 * @author:   geforce
 * @Date:     2018/2/28 下午11:05
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username,String password){

        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" +password);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
