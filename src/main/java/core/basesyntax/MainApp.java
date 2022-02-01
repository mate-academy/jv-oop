package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine jcb = new Excavator("JCB","JC 220", 5);
        Machine cat = new Bulldozer("Caterpillar","D11T", "spherical");
        Machine daf = new Truck("DAF","CF 85", 5);
        jcb.doWork();
        cat.doWork();
        daf.doWork();
        System.out.println("-------------------------------------"
                + "---------------------------------->");
        jcb.stopWork();
        cat.stopWork();
        daf.stopWork();
    }
}
