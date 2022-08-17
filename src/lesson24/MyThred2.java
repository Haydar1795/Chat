package lesson24;

public class MyThred2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10000; i < 10005; i++) {
            System.out.println(i);

        }
    }
}
