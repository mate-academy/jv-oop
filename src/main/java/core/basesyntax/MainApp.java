package core.basesyntax;

public class MainApp {
    Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
    for(Machine machine: machines){
        machine.doWork();
        machine.stopWork();
    }
}
