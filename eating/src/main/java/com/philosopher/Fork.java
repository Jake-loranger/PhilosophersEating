package com.philosopher;

public class Fork {
    boolean status = true;

    public synchronized boolean getFork() {
        return status;
    }
    public synchronized void setFork(boolean status) {
        this.status = status;
    }
}
