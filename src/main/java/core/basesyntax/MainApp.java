package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine jcb = new Excavator();
        jcb.setBrand("JCB");
        jcb.setModel("JC 220");
        Machine cat = new Bulldozer();
        cat.setBrand("Caterpillar");
        cat.setModel("D11T");
        Machine daf = new Truck();
        daf.setBrand("DAF");
        daf.setModel("CF 85");
        jcb.doWork();
        cat.doWork();
        daf.doWork();
        System.out.println("-----------------------------------------------");
        jcb.stopWork();
        cat.stopWork();
        daf.stopWork();
    }
}
