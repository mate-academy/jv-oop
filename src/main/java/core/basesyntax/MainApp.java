package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine one = new Excavator();
        Machine two = new Bulldozer();
        Machine three = new Truck();
        Machine[] machines = {one, two, three};
        for (int i = 0; i < machines.length; i++) {
            System.out.println(machines[i].doWork());
            System.out.println(machines[i].stopWork());
        }

    }
}