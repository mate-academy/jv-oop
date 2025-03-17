package core.basesyntax;

public class MainApp {
    
    public static void main(String[] args) {
        Machine[] machineList = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine mach : machineList) {
            mach.doWork();
            mach.stopWork();
        }
    }
}
