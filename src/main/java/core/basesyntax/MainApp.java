package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine track = new Track();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();

        track.doWork();
        excavator.doWork();
        bulldozer.doWork();

        track.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }

}
