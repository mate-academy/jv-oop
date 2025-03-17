package core.basesyntax;

public class MainApp {
    
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machineList = {bulldozer, excavator, truck};
        for (Machine mach : machineList) {
            mach.doWork();
            mach.stopWork();
        }
    }
}
