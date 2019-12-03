package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am a Bulldozer and I started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("I am a Bulldozer and I stoped to work");
    }
}
