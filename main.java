class Main {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
