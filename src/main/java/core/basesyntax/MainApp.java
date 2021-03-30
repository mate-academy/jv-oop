package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck machine1 = new Truck();
        machine1.setName("Мишаня");
        Excavator machine2 = new Excavator();
        machine2.setName("Ванёк");
        Bulldozer machine3 = new Bulldozer();
        machine3.setName("Лёник");

        machine1.doWork();
        machine2.doWork();
        machine3.doWork();

        machine1.stopWork();
        machine2.stopWork();
        machine3.stopWork();
    }
}
