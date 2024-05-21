package core.basesyntax;

public class MainApp {
    public static void main(String[] args){
        Machine MAN = new Truck();
        Machine JBC = new Bulldozer();
        Machine CAt = new Excavator();
        Machine[] array = new Machine[] {MAN, JBC, CAt};

        for (int i = 0; i < array.length; i++) {
            array[i].doWork();
            array[i].stopWork();
        }
    }
}
