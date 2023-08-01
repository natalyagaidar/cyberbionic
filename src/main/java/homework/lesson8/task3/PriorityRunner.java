package homework.lesson8.task3;

public class PriorityRunner {
    private static PriorityThread mainThread = new PriorityThread("main");
    private static PriorityThread secondThread = new PriorityThread("second");
    private static PriorityThread thirdThread = new PriorityThread("third");

    public static void main(String[] args) {
        mainThread.setPriority(Thread.MAX_PRIORITY);
        secondThread.setPriority(Thread.NORM_PRIORITY);
        thirdThread.setPriority(Thread.MIN_PRIORITY);

        mainThread.start();
        secondThread.start();
        thirdThread.start();
    }
}

class PriorityThread extends Thread {

    private String name;

    public PriorityThread(String name) {
        super();
        this.name = name;
    }

    public String getThreadName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread " + name);
        for (int i = 1; i <= 50; i++) {
            try {
                System.out.println("Thread " + name + " " + i);
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
