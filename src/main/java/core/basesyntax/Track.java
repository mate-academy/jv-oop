package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("The Track began its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("The Track stopped its work");
    }
}
