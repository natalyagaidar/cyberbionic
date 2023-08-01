package homework.lesson8.task7;

public class DaemonMain {
    public static void main(String[] args) throws InterruptedException {
        Daemon daemon = new Daemon();
        daemon.setDaemon(true);

        daemon.start();
        System.out.println("Daemon: name: " + daemon.getName() + ". Is alive: " + daemon.isAlive() + ". Is daemon: " + daemon.isDaemon()
                + " " + daemon.toString());
    }
}

class Daemon extends Thread {
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Starting daemon");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.print("Error" + e);
        } finally {
            if (isDaemon())
                System.out.println("End of daemon");
        }
    }
}
