/**
 * Абстрактний клас, що представляє машину.
 */
package core.basesyntax;

public abstract class Machine {
    public Machine() {
    }
    /**
     * Запускає роботу машини.
     */
    public abstract void doWork();
    /**
     * Зупиняє роботу машини.
     */
    public abstract void stopWork();
}
