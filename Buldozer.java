package org.example;

public class Buldozer extends Machine
{
    @Override
    public void doWork()
    {
        System.out.println("Bulldozer started its work.");
    }

    @Override
    public void stopWork()
    {
        System.out.println("Bulldozer stopped working.");
    }
}
