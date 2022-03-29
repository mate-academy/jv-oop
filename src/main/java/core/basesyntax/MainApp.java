package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();

        Machine[] machines = {truck, bulldozer, excavator};

        for (Machine i : machines) {
            System.out.println(i.doWork());
            System.out.println(i.stopWork());
        }
    }
}
