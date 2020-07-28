package core.basesyntax;

/**
 * - Создать класс Machine с методами public abstract void doWork()
 * и public abstract void stopWork().
 * - Создать классы Track, Bulldozer, Excavator которые унаследуют Machine.
 * - Переопределить метод doWork() и вывести в консоль строку с сообщением что та или иная
 * машина начала свою работу.
 * - Переопределить метод stopWork() и вывести в консоль строку с сообщением что та или иная
 * машина прекратила свою работу.
 * - В классе Main создать по одному экземпляру каждого класса.
 * - Отправить все машины на работу и остановить работу всех машин.
 */
public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine track = new Track();
        excavator.doWork();
        bulldozer.doWork();
        track.doWork();
        excavator.stopWork();
        bulldozer.stopWork();
        track.stopWork();
    }
}
