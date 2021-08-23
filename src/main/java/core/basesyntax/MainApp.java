package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine man = new Truck();
        man.setName("Man");
        man.doWork();
        man.stopWork();

        Machine bulldozer = new Bulldozer();
        bulldozer.setName("MTZ");
        bulldozer.doWork();
        bulldozer.stopWork();

        Machine excavator = new Excavator();
        excavator.setName("Caterpillar");
        excavator.doWork();
        excavator.stopWork();

    }


}
