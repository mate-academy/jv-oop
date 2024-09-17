package core.basesyntax;

public static void main(String[] args) {
Machine[] machines = {
        new Truck(),
        new Bulldozer(),
        new Excavator()
};

for (Machine machine : machines){
    machine.doWork();
    machine.stopWork();
}
    }
}
