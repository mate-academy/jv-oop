package mate.academy;

public class Main {
    public static void main(String[] args) {

        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine[] machines = new Machine[] {excavator,bulldozer,truck};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
