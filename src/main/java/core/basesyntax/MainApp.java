package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavation = new Excavator();
        System.out.println(bulldozer.doWork());
        System.out.println(truck.doWork());
        System.out.println(excavation.doWork());
        /*
        System.out.println(bulldozer.stopWork());
        System.out.println(truck.stopWork());
        System.out.println(excavation.stopWork());
        */
        Machine[] machine1 = new Machine[]{bulldozer, truck, excavation};
        for (Machine machine : machine1) {
            println(machine);
        }
    }

    public static void println(Machine machine) {
        System.out.println(machine.stopWork());
    }

}
