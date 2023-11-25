package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machine = { new Excavator(), new Bulldozer(), new Truck() };
        int count = 0;
        while (machine.length > count) {
            machine[count].doWork();
            machine[count].stopWork();
            count++;
        }
    }
}
