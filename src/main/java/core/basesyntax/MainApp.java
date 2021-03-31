package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        truck.setName("\"TeslaCyberTrack\"");
        bulldozer.setName("\"Caterpillar\"");
        excavator.setName("\"Bagger228\"");

        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }

}
