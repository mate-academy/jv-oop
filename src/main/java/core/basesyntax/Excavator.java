/**
 * Клас, що представляє екскаватор.
 */
package core.basesyntax;

class Excavator extends Machine {
    Excavator() {
    }

    public void doWork() {
        System.out.println("Truck started working.");
    }

    public void stopWork() {
        System.out.println("Truck stopped working.");
    }
}
