package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] machines = new Machine[3];
        machines[0] = new Bulldozer();
        machines[1] = new Truck();
        machines[2] = new Excavator();

        for (int i = 0; i < machines.length; i++) {
            System.out.println(machines[i].doWork());
            System.out.println(machines[i].stopWork());
        }
    }

}
