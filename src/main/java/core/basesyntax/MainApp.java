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
    public static void main(String[] args) {
        Machine Track1 = new Track();
        Machine Bulldozer1 = new Bulldozer();
        Machine Excavator1 = new Excavator();
        Track1.doWork();
        Bulldozer1.doWork();
        Excavator1.doWork();
        Track1.stopWork();
        Bulldozer1.stopWork();
        Excavator1.stopWork();
    }
}
