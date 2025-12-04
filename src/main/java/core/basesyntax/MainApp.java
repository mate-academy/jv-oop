package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // 1 & 2: Creation and initialization of the Machine array
        Machine[] fleet = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        // 3: Calling doWork() and stopWork() methods in a loop

        // Phase 1: Start work
        System.out.println("--- Starting construction equipment ---");
        for (Machine m : fleet) {
            m.doWork();
        }

        // Phase 2: Stop work
        System.out.println("\n--- Stopping construction equipment ---");
        for (Machine m : fleet) {
            m.stopWork();
        }
    }
}
