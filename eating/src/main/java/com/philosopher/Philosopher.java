package com.philosopher;

class Philosopher implements Runnable {
    String name;
    Fork leftFork;
    Fork rightFork;

    public Philosopher(String name, Fork rightFork, Fork leftFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void think() {
        System.out.println("\n" + name + " is thinking.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eat() {
        synchronized(leftFork) {
            if (!leftFork.isAvailable()) {
                try {
                    leftFork.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized(rightFork) {
                if (!rightFork.isAvailable()) {
                    try {
                        rightFork.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                rightFork.setStatus(false);
                leftFork.setStatus(false);
                System.out.println("\n" + name + " is eating");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                rightFork.setStatus(true);
                leftFork.setStatus(true);

                leftFork.notifyAll();
                rightFork.notifyAll();
            }
        }
    }

    @Override
    public void run() {
        
        while (true) {
            
            eat();
            think();
            
        }
    }
}
