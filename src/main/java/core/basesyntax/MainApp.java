package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine firstTrack = new Track();
        Machine firstBulldozer = new Bulldozer();
        Machine firstExcavator = new Excavator();

        System.out.println(firstTrack.goWork());
        System.out.println(firstBulldozer.goWork());
        System.out.println(firstTrack.goWork());

        System.out.println(firstTrack.stopWork());
        System.out.println(firstBulldozer.stopWork());
        System.out.println(firstExcavator.stopWork());
    }
}
