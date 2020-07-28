package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Track track1 = new Track();
        track1.doWork();
        track1.stopWork();

        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.doWork();
        bulldozer1.stopWork();

        Excavator excavator1 = new Excavator();
        excavator1.doWork();
        excavator1.stopWork();
    }
}
