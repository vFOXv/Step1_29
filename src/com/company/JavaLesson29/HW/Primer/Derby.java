package com.company.JavaLesson29.HW.Primer;

public class Derby implements Runnable {

    public double timeS;

    public Derby() { }

    @Override
    public void run() {

        String t = Thread.currentThread().getName();

        for (; ; ) {
            timeS = timeS + 1.035005;
            if (!Thread.currentThread().isInterrupted()) {
                break;
            }
        }
        double tS = timeS;
        try {
            Thread.sleep(800);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }

        double tF = timeS;
        double tT = tF - tS;
        System.out.println("Horse " + t + " total count " + tT);
    }
}
