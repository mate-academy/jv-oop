package core.basesyntax;

class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] apparatus = new Machine[3];
        apparatus[0] = new Truck();
        apparatus[1] = new Bulldozer();
        apparatus[2] = new Excavator();

        for (int i = 0; i < apparatus.length; i++) {
            apparatus[i].doWork();
            apparatus[i].stopWork();
        }
    }
}

