package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Track track = new Track();
        bulldozer.doWork();
        excavator.doWork();
        track.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        track.stopWork();
    }
}
