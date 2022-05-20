package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine bob = new Truck();
        Machine alis = new Excavator();
        Machine poll = new Bulldozer();

        Machine[] array = new Machine[]{bob, alis, poll};
        for (int i = 0; i < 3; i++) {
            array[i].doWork();
            array[i].stopWork();
        }
    }
}
