package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine track = new Track();
        bulldozer.doWork();
        excavator.doWork();
        track.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        track.stopWork();
    }
}
