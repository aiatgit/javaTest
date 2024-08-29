package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Thread {
    public static void main(String[] args) {
        Main m = new Main();
        m.start();


    }

    public void run(){
        int a = 10;
        int b = 15;

        System.out.println(a*b);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(b/a);
    }
}