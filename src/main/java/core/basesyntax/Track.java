package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am a Track and I started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("I am a Track and I stoped to work");
    }
}
