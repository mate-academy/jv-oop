package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine track = new Track();
        Machine bulldozer = new Bulldozer();

        excavator.doWork();
        track.doWork();
        bulldozer.doWork();

        excavator.stopWork();
        track.stopWork();
        bulldozer.stopWork();
    }

}
