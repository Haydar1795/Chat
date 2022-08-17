package lesson24;

public class MyThread extends Thread {


    public void run() {
        while (true) {
            for (int i = 1000; i < 1020; i++) {
                System.out.println(i);
            }
            
        }
    }


    public void start() {
    }
}
