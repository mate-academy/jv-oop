package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] workGroup = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < workGroup.length * 2; i++) {
            if(i < workGroup.length) workGroup[i].doWork();
            else workGroup[i - workGroup.length].stopWork();
        }
        System.out.println("Work is done");
    }
}
