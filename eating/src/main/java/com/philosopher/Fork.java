package com.philosopher;

public class Fork {
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }
    public void setStatus(boolean available) {
        this.available = available;
    }
}
