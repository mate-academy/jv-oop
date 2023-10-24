package oop.base;

public class Main {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Excavator(), new Truck(), new Bulldozer()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
