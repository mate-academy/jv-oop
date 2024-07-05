package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is starting its grading and pushing operation.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer is shutting down after finishing its grading task.");
    }
}
