package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Mashine truck = new Truck();
        Mashine bulldozer = new Bulldozer();
        Mashine excavator = new Excavator();
        Mashine[] mashines = new Mashine[]{truck, bulldozer, excavator};
        for (Mashine mashine : mashines) {
            mashine.doWork();
            mashine.stopWork();
        }
    }
}
