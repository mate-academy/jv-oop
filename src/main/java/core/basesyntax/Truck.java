/**
 * Клас, що представляє вантажівку.
 */
package core.basesyntax;

class Truck extends Machine {
    Truck() {
    }

    public void doWork() {
        System.out.println("Truck started working.");
    }

    public void stopWork() {
        System.out.println("Truck stopped working.");
    }
}
