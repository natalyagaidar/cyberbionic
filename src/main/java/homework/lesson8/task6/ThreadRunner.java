package homework.lesson8.task6;

public class ThreadRunner {
    public static Object lockObjectA = new Object();
    public static Object lockObjectB = new Object();

    public static void main(String[] args) {

        ClassA classA = new ClassA("classA");
        ClassB classB = new ClassB("classB");

        classA.setThread(classB);
        classB.setThread(classA);

        classA.start();
        classB.start();

    }

    static class ClassA extends Thread {
        Thread t;
        String name;

        public ClassA(String name) {
            super();
            this.name = name;
        }

        @Override
        public void run() {
            lockMethod();
        }

        public synchronized void lockMethod() {
            System.out.println("Thread " + name + " starting");
            synchronized (lockObjectA) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread " + name + " " + i);
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
            synchronized (lockObjectB) {
                System.out.println("Thread " + name + " finished.");
            }
        }

        public void setThread(Thread t) {
            this.t = t;
        }
    }

    static class ClassB extends Thread {
        Thread t;
        String name;

        public ClassB(String name) {
            super();
            this.name = name;
        }

        @Override
        public void run() {
            lockMethod();
        }

        public synchronized void lockMethod() {
            System.out.println("Thread " + name + " starting");
            synchronized (lockObjectB) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread " + name + " " + i);
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }
            synchronized (lockObjectA) {
                System.out.println("Thread " + name + " finished.");
            }
        }

        public void setThread(Thread t) {
            this.t = t;
        }
    }
}

