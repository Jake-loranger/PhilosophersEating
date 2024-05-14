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

        Philosopher philosopher1 = new Philosopher("philosopher1", fork51, fork12);
        Philosopher philosopher2 = new Philosopher("philosopher2", fork12, fork23);
        Philosopher philosopher3 = new Philosopher("philosopher3", fork23, fork34);
        Philosopher philosopher4 = new Philosopher("philosopher4", fork34, fork45);
        Philosopher philosopher5 = new Philosopher("philosopher5", fork45, fork51);

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();
        
    }
}
