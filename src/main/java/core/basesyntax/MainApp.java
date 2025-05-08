package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Mashine[] mashines = {
                new Truck(),
                new Bulldozer(),
                new Excavator(),
        };
        for (Mashine mashine : mashines) {
            mashine.doWork();
            mashine.stopWork();
        }
    }
}
