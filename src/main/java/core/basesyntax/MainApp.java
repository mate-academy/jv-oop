package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] machines = new Machine[] {new Excavator(), new Bulldozer(), new Excavator()};
        for (Machine counterMachine : machines) {
            counterMachine.doWork();
            counterMachine.stopWork();
        }
    }
}
