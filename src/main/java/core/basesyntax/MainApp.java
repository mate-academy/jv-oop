package core.basesyntax;

/**
 * - Создать класс Machine с методами public abstract void doWork()
 * и public abstract void stopWork().
 * - Создать классы Track, Bulldozer, Excavator которые унаследуют Machine.
 * - Переопределить метод doWork() и вывести в консоль строку с сообщением что та или иная
 * машина начала свою работу.
 * - Переопределить метод stopWork() и вывести в консоль строку с сообщением что та или иная
 * машина прекратила свою работу.
 * - В классе Main создать добавить по одному екземпляру каждого класса.
 * - Отправить все машини на работу и остановить работу всех машин.
 */
public class MainApp {
    Machine trackOne = new Track();
    Machine bulldozerOne = new Bulldozer();
    Machine excavatorOne = new Excavator();

    public void startWorking() {
        trackOne.doWork();
        bulldozerOne.doWork();
        excavatorOne.doWork();
    }

    public void stopWorking() {
        trackOne.stopWork();
        bulldozerOne.stopWork();
        excavatorOne.stopWork();
    }
}
