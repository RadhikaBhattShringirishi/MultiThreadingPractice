import java.util.*;
import java.lang.*;
import java.io.*;

class MyThread implements Runnable {
    
    public void run() {
        System.out.println("Child Thread is running!");
    }
}

// The main method must be in a class named "Main".
public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread thread = new Thread(mt);
        thread.start();
        System.out.println("Main Thread is running!");
    }
}