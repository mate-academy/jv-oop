package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine ford = new Truck();
        Machine volvo = new Bulldozer();
        Machine cat = new Excavator();
        Machine [] garage = {ford, volvo, cat};
        for (Machine machine : garage) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
