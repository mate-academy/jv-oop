package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrayMachine = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine oneMachine : arrayMachine) {
            oneMachine.doWork();
            oneMachine.stopWork();
        }
    }
}
