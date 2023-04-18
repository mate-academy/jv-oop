package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinas = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machinas) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
