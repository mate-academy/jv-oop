public class Main {
    public static void main(String[] args) {

        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Excavator excavator = new Excavator();

        Machine[] machines = {bulldozer, truck, excavator};

        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }

    }
}
