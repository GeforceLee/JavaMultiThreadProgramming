package com.geforcelee.c01.p012;

/**
 * Copyright (C), 2018, GeforceLee
 * Author:   geforce
 * Date:     2018/2/28 下午11:07
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
