package machinepackage;

public class Main {
    public static void main(String[] args) {
        Machine[] machine = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machines : machine) {
            machines.doWork();
            machines.stopWork();
        }
}
    }
