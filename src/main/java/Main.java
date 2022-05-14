public class Main {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[3];
        machineArray[0] = new Truck();
        machineArray[1] = new Bulldozer();
        machineArray[2] = new Excavator();
        for (Machine machine : machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
