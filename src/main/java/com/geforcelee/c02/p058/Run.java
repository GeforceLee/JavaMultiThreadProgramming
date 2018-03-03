package com.geforcelee.c02.p058;

import com.geforcelee.c02.p055.HasSelfPrivateNum;
import com.geforcelee.c02.p055.MyThread1;
import com.geforcelee.c02.p055.MyThread2;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/3 下午2:40
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum privateNum1 = new HasSelfPrivateNum();
        HasSelfPrivateNum privateNum2 = new HasSelfPrivateNum();

        MyThread1 myThread1 = new MyThread1(privateNum1);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(privateNum2);
        myThread2.start();

    }
}
