package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck001 = new Truck();
        Machine bulldozer001 = new Bulldozer();
        Machine excavator001 = new Excavator();

        truck001.setName("\"TeslaCyberTrack\"");
        bulldozer001.setName("\"Caterpillar\"");
        excavator001.setName("\"Bagger228\"");

        truck001.doWork();
        bulldozer001.doWork();
        excavator001.doWork();

        System.out.println(); //Blank line between starters and stoppers

        truck001.stopWork();
        bulldozer001.stopWork();
        excavator001.stopWork();
    }

}
