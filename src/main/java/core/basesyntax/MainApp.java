package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine volvo = new Truck();
        Machine kamatsu = new Bulldozer();
        Machine cat = new Excavator();
        Machine[] apparatuses = new Machine[]{volvo, kamatsu, cat};

        for (int i = 0; i < apparatuses.length; i++) {
            apparatuses[i].doWork();
            apparatuses[i].stopWork();
        }
    }
}
