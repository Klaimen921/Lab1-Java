package com.company;

public class MainThread extends Thread {
    private final int id;
    private final BreakThread breakThread;
    private final int step;

    public MainThread(int id, BreakThread breakThread, int step) { //конструктор
        this.id = id;
        this.breakThread = breakThread;
        this.step = step;
    }

    @Override
    public void run() {                        // при старті цього калсу визветься ця функція
        long col = 0;
        long sum = 0;
        boolean isStop = false;
        do {
            col++;
            sum += step;
            isStop = breakThread.isCanBreak();//перевірка чи бул не змінивсь
        } while (!isStop);
        System.out.println(id + " sum - " + sum + " col - " + col);
    }
}
