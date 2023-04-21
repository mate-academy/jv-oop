package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArr = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machinesArr) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
