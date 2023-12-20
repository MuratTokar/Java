package day_053_hakan;

import java.io.DataInput;

public class Multithreading {
    /**
     * Java - (A)Synchronized bir dil degildir, (non)thread-safe degildir
     * Python - Synchronized bir dildir, thread-safe dir
     *
     * Default thread name : main
     * default thread id : 1
     *
     * - Threadler,birbirinden bagimsiz calisirlar
     * - Ortak memory kullanirlar
     * - Bir threadin hatasi diger threadi etkilemez
     */

    public static void main(String[] args) {
        System.out.println("Sleep oncesi");
       long timeStart = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
        System.out.println("Sleep sonrasi");
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());

        thread.setName("FirstThread");
        System.out.println(thread.getName());
        System.out.println(thread.getId());

        System.out.println(thread);
        System.out.println(thread.getPriority());
        System.out.println(thread.getThreadGroup().getName());

        System.out.println(10 / 0);
    }
}
