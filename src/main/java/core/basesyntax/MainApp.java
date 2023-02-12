package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck volvo = new Truck();
        Bulldozer kamatsu = new Bulldozer();
        Excavator cat = new Excavator();
        Machine[] apparatuses = new Machine[]{volvo, kamatsu, cat};

        for (int i = 0; i < apparatuses.length; i++) {
            apparatuses[i].doWork();
            apparatuses[i].stopWork();
            //Where should be implementation of classes ?
        }
    }
}
