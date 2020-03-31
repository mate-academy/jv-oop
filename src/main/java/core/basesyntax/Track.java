package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track starts works");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stop works");
    }
}
