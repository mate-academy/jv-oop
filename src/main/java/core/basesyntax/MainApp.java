package core.basesyntax;

public class MainApp {
Truck truck = new Truck();
Buldozer buldozer = new Buldozer();
Excavator excavator = new Excavator();
    Machine[] machines = {truck, buldozer, excavator};
    for (Machine machine : machines){
        machine.doWork();
        machine.stopWork();
    }
}
