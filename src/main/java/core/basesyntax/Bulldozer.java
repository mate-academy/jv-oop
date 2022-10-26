package core.basesyntax;

public class Bulldozer extends Machine { //class Bulldozer extended from abstract Machine

    @Override
    public void doWork() { //overridden from abstract method to print Bulldozer's start
        System.out.println("Bulldozer starts working");
    }

    @Override
    public void stopWork() { //overridden from abstract method to print Bulldozer's stop
        System.out.println("Bulldozer stops working");
    }
}
