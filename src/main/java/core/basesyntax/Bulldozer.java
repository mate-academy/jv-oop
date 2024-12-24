package core.basesyntax;

public class Bulldozer extends Machine {
    
    @Override
    public void doWork() {
        System.out.println("Brrrrrrr!");
    }

    @Override
    public void stopWork() {
        System.out.println("Wshhhh");
    }
}
