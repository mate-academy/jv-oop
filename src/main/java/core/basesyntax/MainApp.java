package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[] {new Track(),new Bulldozer(),new Excavator()};

        for (Machine machine : machines) {
            machine.goWork();
            machine.stopWork();
        }
    }
}
