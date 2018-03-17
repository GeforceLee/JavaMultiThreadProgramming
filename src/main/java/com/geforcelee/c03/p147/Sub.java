package com.geforcelee.c03.p147;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/17 下午1:14
 */
public class Sub extends Base {

    public Sub() {
        System.out.println("sub");
    }

    public Sub(String a){

        System.out.println("sub a" +a);
    }

    public static void main(String[] args) {
//        Sub sub = new Sub();
//        System.out.println(sub);


        Sub sub1 = new Sub("a");
        System.out.println(sub1);
    }




}
