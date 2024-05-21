package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine mam = new Truck();
        Machine jbc = new Bulldozer();
        Machine cat = new Excavator();
        Machine[] array = new Machine[] {mam, jbc, cat};

        for (Machine machine : array) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
