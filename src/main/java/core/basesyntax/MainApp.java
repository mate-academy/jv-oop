package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        System.out.println();
        for (Machine machine : machines){
            machine.doWork();
            machine.stopWork();
        }
    }
}
