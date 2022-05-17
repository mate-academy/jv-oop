package oop.base;

public class Main {
    public static void main(String[] args) {
        Machine[] counter = new Machine[]{new Excavator(), new Truck(), new Bulldozer()};
        for (Machine x:
                counter) {
            x.doWork();
            x.stopWork();
        }

    }
}
