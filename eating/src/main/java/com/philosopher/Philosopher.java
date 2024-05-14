package com.philosopher;

public class Philosopher extends Thread {
    String name;
    Fork leftFork;
    Fork rightFork;
    boolean isEating = false;

    public Philosopher(String name, Fork rightFork, Fork leftFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        if (leftFork.status && rightFork.status) {
            // Communicate to other threads the forks are being used, use notifyAll() method
            leftFork.status = false;
            rightFork.status = false;
            isEating = true;
            System.out.println(name + " is eating");

            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }

            // Communicate to other threads the forks are done being used, use notifyAll() method
            leftFork.status = true;
            rightFork.status = true;
            isEating = false;
            System.out.println(name + " is done eating");
        } else {
            System.out.println(name + " is waiting to eat");

            // wait to be notifyed by other threads
            // wait();
        }

    }

}
