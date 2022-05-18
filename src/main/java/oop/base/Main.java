package oop.base;

public class Main {
    public static void main(String[] args) {
        Machine[] counter = new Machine[]{new Excavator(), new Truck(), new Bulldozer()};
        for (Machine machine : counter) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
