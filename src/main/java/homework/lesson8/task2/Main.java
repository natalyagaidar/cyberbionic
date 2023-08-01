package homework.lesson8.task2;

public class Main {
    private static MyThread mainThread = new MyThread("main");
    private static MyThread secondThread = new MyThread("second");
    private static MyThread thirdThread = new MyThread("third");

    public static void main(String[] args) {
        mainThread.start();
        secondThread.start();
        thirdThread.start();

        if (mainThread.isAlive()) {
            try {
                mainThread.join();
            } catch (InterruptedException e) {
            }
        }

        if (secondThread.isAlive()) {
            try {
                secondThread.join();
            } catch (InterruptedException e) {
            }
        }

        if (thirdThread.isAlive()) {
            try {
                thirdThread.join();
            } catch (InterruptedException e) {
            }
        }

        if (!mainThread.isAlive()) System.out.println("Finished: " + mainThread.getThreadName());
        if (!secondThread.isAlive()) System.out.println("Finished: " + secondThread.getThreadName());
        if (!thirdThread.isAlive()) System.out.println("Finished: " + thirdThread.getThreadName());
    }
}

class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        super();
        this.name = name;
    }

    public String getThreadName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread " + name);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Thread " + name + " " + i);
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
