package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // Tworzenie tablicy z obiektami różnych maszyn
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        // Iteracja po tablicy i uruchamianie maszyn
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
