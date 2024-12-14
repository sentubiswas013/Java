package tutorial.com.example.tutorial;

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getId() + " is executing");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start(); // Starts thread 1
        t2.start(); // Starts thread 2
        System.out.println("Multithreading");
    }
}
