package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ShareCounter {

    private AtomicInteger count =new AtomicInteger();

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}
