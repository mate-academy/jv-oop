package core.basesyntax;

public class MainApp {
    git
    public static void main(String[] args) {
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator(),
        };
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
            System.out.println("---");
        }
    }
}










