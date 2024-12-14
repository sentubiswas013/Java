package tutorial.com.example.tutorial;

class MyThreadClass extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Threadclass {
    public static void main(String[] args) {
        MyThreadClass t = new MyThreadClass();
        t.start(); // Starts the thread
    }

}
