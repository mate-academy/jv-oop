package mate;

public class Main {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Excavator(), new Bulldozer()};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
