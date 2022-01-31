package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public  void doWork() {
        System.out.println(getBrand()+" "+getModel()+" - started site planning!");
    }
    @Override
    public  void stopWork() {
        System.out.println(getBrand() + " " + getModel() + " - finished work!");
    }
}
