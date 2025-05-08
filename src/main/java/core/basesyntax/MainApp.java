package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machines[] machines = new Machines[]{new Bulldozer(), new Excavator(), new Truck()};
        for (Machines currentMachine : machines) {
            System.out.println(currentMachine.doWork());
            System.out.println(currentMachine.stopWork());
        }
    }
}
