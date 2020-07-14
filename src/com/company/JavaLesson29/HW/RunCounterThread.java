package com.company.JavaLesson29.HW;



public class RunCounterThread {
    //Напишите класс, реализующий интерфейс Runnable, содержащий поле-счетчик. Метод run()
    //должен наращивать этот счетчик. Создайте пять экземпляров этого класса и запустите их в пяти
    //потоках с разными приоритетами. После 3 секунд работы остановите потоки и сравните значения
    //счетчиков.
    public static void main(String[] args) {
        CounterThread counterThread1 = new CounterThread(1, "Thread 1");
        counterThread1.setDaemon(true);
        counterThread1.start();

        CounterThread counterThread2 = new CounterThread(2,"Thread 2");
        counterThread2.setDaemon(true);
        counterThread2.start();

        CounterThread counterThread3 = new CounterThread(3,"Thread 3");
        counterThread3.setDaemon(true);
        counterThread3.start();

        CounterThread counterThread4 = new CounterThread(4,"Thread 4");
        counterThread4.setDaemon(true);
        counterThread4.start();

        CounterThread counterThread10 = new CounterThread(10,"Thread 10");
        //counterThread10.setDaemon(true);
        counterThread10.start();
        //counterThread10.isInterrupted();                                              //не понимаю как работать с isInterrupted() !!!

        new Thread(()->{                                                            //не смог запустить этот поток(он должен мониторить состояние counterThread10(единственного не демона))
            System.out.println("Test "+Thread.currentThread().getName());           //если бы его удалось закрыть - то остальные демоны тоже должны свернуться
                while(true){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(counterThread10.isAlive());
                }});
    }
}

class CounterThread extends Thread {
    private int counter;
    private int priority;
    private String name;

    public CounterThread(int priority, String name) {
        this.priority = priority;
        this.name = name;

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        double start = System.currentTimeMillis();
        Thread.currentThread().setPriority(priority);
        Thread.currentThread().setName(name);
        System.out.println("Is this thread a DAEMON? --> "+ Thread.currentThread().getName()+" "+Thread.currentThread().isDaemon()+" / "+"Priority = " + Thread.currentThread().getPriority());
        counter = 0;

        while (true) {
            setCounter(getCounter()+1);
            //System.out.print(getCounter()+" ");
            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {                                                                          //без блока finally часть потоков демонов переодически теряется и не выводят показания счетчиков(но программа полность завершаеться)
                double stop = System.currentTimeMillis();                                       //по видимому они сворачиваються раньше(по завершению потока НЕ демона) чем успевают распечатать счетчик
                if((stop-start) > 3000){
                    Thread.currentThread().interrupt();                                         //не понимаю как работать с interrupt()!!!
                    System.out.println(Thread.currentThread().getName() + " --> "+getCounter());
                    break;
                }
            }
        }
    }
}
