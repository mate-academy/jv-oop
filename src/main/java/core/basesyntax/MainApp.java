package core.basesyntax;

public class MainApp {
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
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        //Excavator
        excavator.doWork();
        excavator.stopWork();
        Machine bulldozer = new Bulldozer();
        //Bulldozer
        bulldozer.doWork();
        bulldozer.stopWork();
        Machine track = new Track();
        //Track
        track.doWork();
        track.stopWork();
    }
}
