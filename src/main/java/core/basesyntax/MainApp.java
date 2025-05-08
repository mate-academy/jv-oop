package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine track = new Track("Track001");
        Machine bulldozer = new Bulldozer("Bulldozer002");
        Machine excavator = new Excavator("Excavator003");

        track.doWork();
        bulldozer.doWork();
        excavator.doWork();

        track.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
