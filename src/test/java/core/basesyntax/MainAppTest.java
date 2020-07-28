package core.basesyntax;

public class MainAppTest {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Track track = new Track();
        Bulldozer bulldozer = new Bulldozer();
        excavator.doWork();
        track.doWork();
        bulldozer.doWork();
        excavator.stopWork();
        track.stopWork();
        bulldozer.stopWork();
    }
}