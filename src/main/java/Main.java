public class Main {
    public static void main(String[] args) {
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine Excavator = new Excavator();
        Machine[] machines = new Machine[]{Truck,Bulldozer,Excavator};
        for (int i = 0;i < machines.length;i++){
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
