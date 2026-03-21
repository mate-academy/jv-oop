package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine volvo = new Truck();
        Machine cat = new Excavator();
        Machine shantui = new Bulldozer();
    }

    public static Machine loop(Machine[] vehicles) {
        for (Machine machine : vehicles) {
            machine.doWork();
            machine.stopWork();
        }
        return null;
    }

}
