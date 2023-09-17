package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine elementStart : machines){
            elementStart.doWork();
        }

        System.out.println();

        for (Machine elementStop : machines){
            elementStop.stopWork();
        }
    }

}
