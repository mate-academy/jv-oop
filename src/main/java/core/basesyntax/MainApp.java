package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine jcb = new Excavator("JCB","JC 220", 5);
        Machine cat = new Bulldozer("Caterpillar","D11T", "spherical");
        Machine daf = new Truck("DAF","CF 85", 5);
        Machine [] machines = new Machine[] {jcb, cat, daf};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
            System.out.println();
        }
    }
}
