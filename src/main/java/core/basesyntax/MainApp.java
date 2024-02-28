package core.basesyntax;

public class MainApp {
    static abstract class Machine {
        public abstract void doWork();
        public abstract void stopWork();
    }
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator() };

        for (Machine machine: machines) {
            System.out.println("----------");
            machine.doWork();
            machine.stopWork();
            System.out.println("----------");
        }
    }
}
