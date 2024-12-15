package tutorial.com.example.tutorial;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("out-----"+ count);
    }
}

public class Synchronized {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment(); // The increment method is synchronized
    }
}
