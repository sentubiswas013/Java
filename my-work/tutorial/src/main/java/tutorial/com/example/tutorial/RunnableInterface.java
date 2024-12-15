package tutorial.com.example.tutorial;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running");
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread t = new Thread(task);
        t.start(); // Starts the thread
    }
}
