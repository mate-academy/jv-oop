package core.basesyntax;

public class MainApp {

    public static void main(String[] arg) {
        Truck truck = new Truck("The Tryastsya");
        Bulldozer bulldozer = new Bulldozer("The Kovinʹka");
        Excavator excavator = new Excavator("The Halepa");

        Machine[] machines = new Machine[] {truck, bulldozer, excavator};
        for (Machine mashine : machines) {
            mashine.doWork();
            mashine.stopWork();
        }
    }

}
