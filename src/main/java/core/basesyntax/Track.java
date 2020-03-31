package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track начал свою работу");
    }

    @Override
    public void stopWork() {
        System.out.println("Track прекратил свою работу");
    }

}
