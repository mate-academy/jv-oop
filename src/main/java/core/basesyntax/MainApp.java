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
        Track mercedes = new Track();
        mercedes.doWork();
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        Excavator excavator = new Excavator();
        excavator.doWork();
        mercedes.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
