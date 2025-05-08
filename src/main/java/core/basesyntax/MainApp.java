package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Macine truck = new Trukc();
        Macine excavator = new Excavator();
        Macine bulldozer = new Bulldozer();
        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();
        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }

}
