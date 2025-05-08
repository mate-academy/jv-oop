package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine volvo = new Truck();
        Machine ain = new Bulldozer();
        Machine doosan = new Excavator();
        volvo.doWork();
        ain.doWork();
        doosan.doWork();
        volvo.stopWork();
        ain.stopWork();
        doosan.stopWork();
    }
}
