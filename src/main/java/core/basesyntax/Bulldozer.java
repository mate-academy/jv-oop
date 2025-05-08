package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        this.setActive(true);
        System.out.println("The bulldozed is leveling the ground...");
    }

    @Override
    public void stopWork() {
        this.setActive(false);
        System.out.println("Bulldozer is off work now. If you're in rush, just do it by ourself.");
    }
}
