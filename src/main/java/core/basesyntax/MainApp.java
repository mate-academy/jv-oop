package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine machinery[] = new Machine[]{truck, excavator, bulldozer};
        int count = 0;
        while (count < machinery.length) {
            machinery[count].doWork();
            machinery[count].stopWork();
            count++;
        }
    }
}
