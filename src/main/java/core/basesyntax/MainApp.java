package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine ex = new Excavator();
        Machine bul = new Bulldozer();

        Machine [] machines = new Machine[] {truck, ex, bul};
        for (Machine el : machines) {
            el.doWork();
            el.stopWork();
        }
    }

}
