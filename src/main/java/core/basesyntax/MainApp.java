package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Mashine sprinter = new Truck();
        Mashine komatsu = new Bulldozer();
        Mashine jsb = new Excavator();
        sprinter.doWork();
        komatsu.doWork();
        jsb.doWork();
        sprinter.stopWork();
        komatsu.stopWork();
        jsb.stopWork();
    }

}
