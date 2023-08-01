package homework.lesson8.task5;

//DeadLock
public class ThreadRunner {
    public static void main(String[] args) {

        ClassA classA = new ClassA("classA");
        ClassB classB = new ClassB("classB");

        classA.setThread(classB);
        classB.setThread(classA);

        classA.start();
        classB.start();

    }
}

class ClassA extends Thread {
    Thread t;
    String name;

    public ClassA(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() { lockMethod(); }

    public synchronized void lockMethod() {
        System.out.println("Thread " + name + " starting");
        synchronized (t) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + name + " " + i);
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println("Thread " + name + " finished.");
    }

    public void setThread(Thread t) {
        this.t = t;
    }
}

class ClassB extends Thread {
    Thread t;
    String name;

    public ClassB(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() { lockMethod(); }

    public synchronized void lockMethod() {
        System.out.println("Thread " + name + " starting");
        synchronized (t) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + name + " " + i);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println("Thread " + name + " finished.");
    }

    public void setThread(Thread t) {
        this.t = t;
    }
}

