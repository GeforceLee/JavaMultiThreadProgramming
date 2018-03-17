package com.geforcelee.c03.p160;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午5:07
 */
public class ThreadP  extends  Thread{
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.setValue();
        }

    }
}
