package core.basesyntax;

public abstract class Machine {
    // Абстрактний метод: кожна машина повинна вміти працювати
    public abstract void doWork();

    // Абстрактний метод: кожна машина повинна вміти зупинятися
    public abstract void stopWork();
}
