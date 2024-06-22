package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[] {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };
        for (Machine part : machines) {
            part.doWork();
        }
        for (Machine part : machines) {
            part.stopWork();
        }
    }
}
