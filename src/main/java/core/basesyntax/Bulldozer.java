package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts his brrrrrr");
    }
    @Override
    public void stopWork() {
        System.out.println("It's lunch time");
    }
}
