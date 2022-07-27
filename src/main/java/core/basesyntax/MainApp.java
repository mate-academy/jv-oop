package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machineWork = new Machine[] {bulldozer, excavator, truck};
        for (int i = 0; i < machineWork.length; i++) {
            machineWork[i].doWork();
            machineWork[i].stopWork();
        }
    }
}
