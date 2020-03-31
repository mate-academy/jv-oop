package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Monsieur Excavator is ready to get the job done!");
    }

    @Override
    public void stopWork() {
        System.out.println("Monsieur Excavator got tired and needs some beer to cheer up!");
    }
}
