package com.philosopher;

/*
 
Problem Description: There are five philosophers sitting around a dining table, 
each with a plate of spaghetti and a fork between each pair of adjacent philosophers. 
The philosophers spend their time either eating or thinking. To eat, a philosopher 
must obtain both forks adjacent to them. Once they're done eating, they release 
the forks and start thinking again. The problem is to design a solution that 
prevents deadlock, where no philosopher can obtain the forks they need because 
each philosopher is holding one fork and waiting for the other. 

To solve this problem, you need to implement a solution that ensures: 

1. Mutual exclusion: Only one philosopher can pick up a fork at a time. 

2. No deadlock: Philosophers do not enter a situation where they hold 
one fork and are waiting indefinitely for the other. 

3. No starvation: Every philosopher gets a chance to eat.

*/
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
