package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machines) {
            for(int i = 0; i < 1; i++){
                machine.doWork();
            }
            for(int i = 0; i < 1; i++){
                machine.stopWork();
            }
        }
    }
}

