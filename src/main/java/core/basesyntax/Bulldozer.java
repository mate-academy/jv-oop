package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("I am big bulldozer. I start my job.");
    }

    @Override
    public void stopWork() {
        System.out.println("I am bulldozer. And i am tired. I have stopped working.");
    }
}

