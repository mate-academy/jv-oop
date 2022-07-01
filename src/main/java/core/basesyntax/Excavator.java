package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Damaged water supply system. Digging a trench for a new pipe.");
    }

    @Override
    public void stopWork() {
        System.out.println("The trench has been dug. Let's stop work."); }
}