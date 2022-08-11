package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork(){
        System.out.println("Bulldozer starts removing land");
    }

    @Override
    public void stopWork(){
        System.out.println("Bulldozer stops removing land");
    }
}
