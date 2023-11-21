package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Machine[] machines = {new Truck(), new Buldozer(), new Excavator()};

        for (Machine car: machines)
        {
            car.doWork();
            car.stopWork();
            System.out.println("\n");
        }
    }
}