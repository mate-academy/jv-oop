package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine bob = new Truck();
        Machine alis  = new Excavator();
        Machine poll  = new Bulldozer();

        Machine[] array = new Machine[3];
        array[0] = bob;
        array[1] = alis;
        array[2] = poll;

        for (int i = 0; i < array.length; i++) {
            array[i].doWork();
            array[i].stopWork();
        }
    }
}
