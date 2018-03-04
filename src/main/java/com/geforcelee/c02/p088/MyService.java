package com.geforcelee.c02.p088;

public class MyService {
    public MyList addServiceMethod(MyList list,String data) {
        if (list.getSize() < 1) {
            try {
                Thread.sleep(1000);
                list.add(data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
