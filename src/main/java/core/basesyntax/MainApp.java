package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bl = new Bulldozer();
        Truck tr = new Truck();
        Excavator ex = new Excavator();
     Machine[] machines = new Machine[] { bl,tr,ex};
        for (Machine machin:machines
             ) {
            machin.doWork();
            machin.stopWork();
        }
    }
}
