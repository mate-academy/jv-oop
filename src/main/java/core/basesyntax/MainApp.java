package core.basesyntax;

class MainApp {
    public static void main(String[]args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine [] machines = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine : machines) {
            doWork(machine);
            stopWork(machine);
        }
    }

    public static void doWork(Machine machine) {
        System.out.println(machine.doWork());
    }

    public static void stopWork(Machine machine) {
        System.out.println(machine.stopWork());
    }
}

