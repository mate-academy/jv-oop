package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Excavator(), new Truck(), new Bulldozer()};
        for(Machine machine : machines){
            machine.doWork();
            machine.stopWork();
        }
    }

}
