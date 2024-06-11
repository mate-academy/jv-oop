package core.basesyntax;

public class MainApp {
    public static void main(String[] arg) {
        Machines[] Machines = new Machines[]{new Buldozer(), new Excavator(), new Truck()};
        for (core.basesyntax.Machines currentMachine : Machines){
            currentMachine.doWork();
            currentMachine.stopWork();
        }

    }
}