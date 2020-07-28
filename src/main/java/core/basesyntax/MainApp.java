package core.basesyntax;

public class MainApp {
    public static void main(String[] args){
        Bulldozer machine1 = new Bulldozer();
        Excavator machine2 = new Excavator();
        Track machine3 = new Track();

        machine1.doWork();
        machine2.doWork();
        machine3.doWork();

        machine1.stopWork();
        machine2.stopWork();
        machine3.stopWork();
    }
}
