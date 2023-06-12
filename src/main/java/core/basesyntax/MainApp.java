package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {
        Machine[] newMachine = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : newMachine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}





