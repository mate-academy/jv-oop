package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine [] array = {new Truck(),new Bulldozer(), new Excavator()};
        for (Machine m : array) {
            m.doWork();
            m.stopWork();
        }
    }
}
