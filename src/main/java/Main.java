public class Main {
    public static void main(String[] args) {

        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Excavator excavator = new Excavator();

        Machine[] machines = {bulldozer, truck, excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
