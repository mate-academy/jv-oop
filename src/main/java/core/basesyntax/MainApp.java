package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine[] machines = {excavator,truck,bulldozer};
        for (Machine working : machines) {
            working.doWork();
            working.stopWork();
        }
        System.out.println();
    }
}
