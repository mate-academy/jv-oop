package core.basesyntax;

public class Track extends Machine {

    @Override
    void doWork() {
        System.out.println("Track starts working");
    }

    void stopWork() {
        System.out.println("Track stops working");
    }
}
