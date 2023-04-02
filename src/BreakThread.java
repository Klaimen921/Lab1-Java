package com.company;

import org.w3c.dom.html.HTMLImageElement;

public class BreakThread implements Runnable{
    private boolean canBreak = false;
    private int time;

    public int getTime() {
        return time;
    }
    public  void setTime(int value){
        time=value;
    }
    @Override
    public void run() {                                     //ран спрацювує при старті
        try {                                               //та поток який зупиняє, чекатиме час який ми записали в time
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        canBreak = true;
    }

    synchronized public boolean isCanBreak() { //метод для передачі буля
        return canBreak;
    }
}