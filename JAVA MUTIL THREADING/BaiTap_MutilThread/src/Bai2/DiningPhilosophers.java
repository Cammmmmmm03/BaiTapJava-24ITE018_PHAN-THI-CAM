package Bai2;

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Chopstick[] chopsticks = new Chopstick[numPhilosophers];
        Philosopher[] philosophers = new Philosopher[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            chopsticks[i] = new Chopstick();
        }

        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % numPhilosophers]);
            philosophers[i].start();
        }
    }
}

class Chopstick {
    private boolean isAvailable = true;

    public synchronized void pickUp(int philosopherId) throws InterruptedException {
        while (!isAvailable) {
            wait();
        }
        isAvailable = false;
        System.out.println("Philosopher " + philosopherId + " picked up a chopstick.");
    }

    public synchronized void putDown(int philosopherId) {
        isAvailable = true;
        System.out.println("Philosopher " + philosopherId + " put down a chopstick.");
        notify();
    }
}

class Philosopher extends Thread {
    private int id;
    private Chopstick leftChopstick, rightChopstick;

    public Philosopher(int id, Chopstick left, Chopstick right) {
        this.id = id;
        this.leftChopstick = left;
        this.rightChopstick = right;
    }

    public void run() {
        try {
            while (true) {
                think();
                leftChopstick.pickUp(id);
                rightChopstick.pickUp(id);
                eat();
                leftChopstick.putDown(id);
                rightChopstick.putDown(id);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking...");
        Thread.sleep(500);
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating...");
        Thread.sleep(500);
    }
}

