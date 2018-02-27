/**
 * Copyright (C), 2018, GeforceLee
 * FileName: Run
 * Author:   geforce
 * Date:     2018/2/28 上午12:03
*/

package com.geforcelee.c01.p008;

import com.geforcelee.c01.p007.MyThread;

public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");


        Thread thread1 = new Thread(new MyThread(1));
        thread1.start();
        System.out.println("运行再次结束");
    }
}
