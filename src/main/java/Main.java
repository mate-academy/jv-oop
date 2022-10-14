public class Main {
    public static void main(String[] args) {
        Machine [] machine;
        machine = new Machine[3];
        machine[0] = new Bulldozer();
        machine[1] = new Excavator();
        machine[2] = new Truck();
        for (int i = 0; i < machine.length; i++) {
            machine[i].doWork();
            machine[i].stopWork();
        }
    }
}
