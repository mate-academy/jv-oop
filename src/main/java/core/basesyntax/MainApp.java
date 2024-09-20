package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = {
            new Truck(),
            new Bulldozer(),
            new Excavator()
        };

        for (Machine machines : machine) {
            machines.doWork();
            machines.stopWork();
        }
    }
}
