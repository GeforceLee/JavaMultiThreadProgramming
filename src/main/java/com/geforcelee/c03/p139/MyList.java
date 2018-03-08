package com.geforcelee.c03.p139;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2018, GeforceLee
 *
 * @author: geforce
 * @Date: 2018/3/8 下午10:51
 */
public class MyList {
    private static List list = new ArrayList();

    public static void add(){
        list.add("anyThing");
    }


    public static int size(){
        return list.size();
    }
}
