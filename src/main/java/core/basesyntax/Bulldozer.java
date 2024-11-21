package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("I'm bulldozer and I started working");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer finished working");
    }
}

