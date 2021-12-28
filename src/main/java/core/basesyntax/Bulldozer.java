package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts doing its work!");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer sops doing its work!");
    }
}
