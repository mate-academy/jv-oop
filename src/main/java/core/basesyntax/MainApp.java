package core.basesyntax;

public class MainApp {

    public static void main(String[] names) {
        Machine trucky = new Truck("Trucky");
        Machine bulldy = new Bulldozer("Bulldy");
        Machine excavy = new Excavator("Excavy");
        Machine[] machines = {trucky, bulldy, excavy};
        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
