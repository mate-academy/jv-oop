package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        // Tworzenie tablicy typu Machine (Polimorfizm)
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        System.out.println("--- STARTING WORK ---");

        // Wywołanie metody doWork() w pętli
        for (Machine machine : machines) {
            machine.doWork();
        }

        System.out.println("\n--- STOPPING WORK ---");

        // Wywołanie metody stopWork() w pętli
        for (Machine machine : machines) {
            machine.stopWork();
        }

        System.out.println("\n--- TASK COMPLETE ---");
    }
}