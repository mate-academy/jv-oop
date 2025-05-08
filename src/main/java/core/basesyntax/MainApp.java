package core.basesyntax;

public class MainApp {

    private static Machine[] machines = new Machine[]{
        new Bulldozer(), new Excavator(), new Truck()};

    public static void main(String[] args) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
