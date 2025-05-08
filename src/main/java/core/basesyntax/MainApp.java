package core.basesyntax;

public class MainApp {
    private Machine buldozer = new Bulldozer();
    private Machine excavator = new Excavator();
    private Machine truck = new Truck();

    private Machine[] machines = {buldozer, excavator, truck};

    private void result(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();

        }
    }

}
