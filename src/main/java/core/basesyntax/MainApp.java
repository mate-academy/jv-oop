package core.basesyntax;

public class MainApp {

    static void main(String[] args) {

        Machine[] machines = {
                new Buldozer(),
                new Truck(),
                new Excavator()
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
