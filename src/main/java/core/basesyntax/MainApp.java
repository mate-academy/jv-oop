package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine someMachine : machine) {
            someMachine.doWork();
            someMachine.stopWork();
        }
    }
}
