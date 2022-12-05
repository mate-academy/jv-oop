package core.basesyntax;
//add comments

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
            new Truck(), new Excavator(), new Buldozer()
        };

        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
