package core.basesyntax;
public  class  MainApp {
    public static void main(String[] args) {
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine Excavator = new Excavator();
        Machine[] Machine = new Machine[3];
        Machine[0] = Truck;
        Machine[1] = Bulldozer;
        Machine[2] = Excavator;
        for (int i = 0; i < Machine.length; i++) {
            System.out.println(Machine[i].doWork());
            System.out.println(Machine[i].stopWork());
        }
    }
}
