package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[] {
                new Bulldozer(), new Excavator(), new Truck()
        };

        for (Machine man : machines) {
            man.doWork();

            man.stopWork();
        }
    }

    public static void print(String arg) {
        System.out.println(arg);
    }
}
