package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Truck(), new Excavator()};
        printResult(machines);
    }

    public static void printResult(Machine[] machines) {
        for (Machine working : machines) {
            working.doWork();
            working.stopWork();
        }
    }
}
