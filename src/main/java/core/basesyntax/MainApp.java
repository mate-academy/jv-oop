package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Track track = new Track();
        track.doWork();
        track.stopWork();

        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();

        Excavator excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
    }
}
