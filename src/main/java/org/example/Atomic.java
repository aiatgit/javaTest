package org.example;

public class Atomic {

    public static void main(String[] args) {
    ShareCounter shareCoun = new ShareCounter();

    new Thread(
            ()->{
                System.out.println("Thread 1 started");
                for(int i = 0; i<50000;i++){
                    shareCoun.increment();
                }
                System.out.println("Thread 1 Completed");
            }
    ).start();

    new Thread(
            ()->{
                System.out.println("Thread 2 started");
                for(int i = 0; i<50000;i++){
                    shareCoun.increment();
                }
                System.out.println("Thread 2 Completed");
            }
    ).start();

    try{
        Thread.sleep(2000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }

    System.out.println("Final Count : "+shareCoun.getCount());

    }

}
