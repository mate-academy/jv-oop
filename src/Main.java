public class Main {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];

        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        machines[0] = truck;
        machines[1] = bulldozer;
        machines[2] = excavator;

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();

            System.out.println();
        }
    }
}
