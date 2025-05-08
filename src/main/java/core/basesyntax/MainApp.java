package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] garage = {
                new Bulldozer(),
                new Truck(),
                new Evacuator()
        };
        for (Machine machine : garage) {
            machine.doWork();
            machine.stopWork();
            System.out.println();
        }
    }
}
