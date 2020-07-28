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

        //Creating new objects.
        Machine track = new Track();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        //Starting to do something...
        track.doWork();
        bulldozer.doWork();
        excavator.doWork();

        //Ending to do something...
        track.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
