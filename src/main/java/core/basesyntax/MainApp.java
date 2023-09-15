package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};
        printMethodsInLoop(machines);
    }

    public static void printMethodsInLoop(Machine[] machines){
        for (Machine machine : machines){
            machine.doWork();
            machine.stopWork();
        }
    }
}
