package com.geforcelee.c02.p088;

public class MyThread extends Thread {

    private MyList list;

    public MyThread(MyList list) {
        super();
        this.list = list;
    }


    @Override
    public void run() {
        MyService service = new MyService();
        service.addServiceMethod(list,"A");
    }

    public static void main(String[] args) throws InterruptedException {
        MyList list = new MyList();
        MyThread thread1 = new MyThread(list);
        thread1.start();

        MyThread thread2 = new MyThread(list);
        thread2.start();
        Thread.sleep(5000);
        System.out.printf("end size = "+ list.getSize());
    }
}
