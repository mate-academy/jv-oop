package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Створення масиву типу Machine
        Machine[] machines = new Machine[] {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        System.out.println("--- STARTING WORK CYCLE ---");
        // Цикл для виклику doWork()
        for (Machine machine : machines) {
            machine.doWork();
        }

        System.out.println("\n--- STOPPING WORK CYCLE ---");
        // Цикл для виклику stopWork()
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}