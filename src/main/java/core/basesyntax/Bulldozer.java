package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(super.getName() + " Bulldozer started working");
    }

    @Override
    public void stopWork() {
        System.out.println(super.getName() + " Bulldozer stopped working");
    }
    
}
