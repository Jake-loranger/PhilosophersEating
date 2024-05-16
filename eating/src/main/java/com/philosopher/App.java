package com.philosopher;

public class App 
{
    public static void main( String[] args )
    {
        Fork fork12 = new Fork();
        Fork fork23 = new Fork();
        Fork fork34 = new Fork();
        Fork fork45 = new Fork();
        Fork fork51 = new Fork();

        Thread philosopher1 = new Thread(new Philosopher("philosopher1", fork51, fork12));
        Thread philosopher2 = new Thread(new Philosopher("philosopher2", fork12, fork23));
        Thread philosopher3 = new Thread(new Philosopher("philosopher3", fork23, fork34));
        Thread philosopher4 = new Thread(new Philosopher("philosopher4", fork34, fork45));
        Thread philosopher5 = new Thread(new Philosopher("philosopher5", fork45, fork51));

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
        
    }
}
