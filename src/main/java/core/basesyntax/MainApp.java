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
    public void mainApp() {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine track = new Track();
        Machine[] park = {excavator, bulldozer, track};
        for (Machine machine : park) {
            machine.doWork();
            machine.stopWork(); //Надеюсь, не принципиально, что бы все работали одновременно. Так они по очереди вкл/выкл.
        }
    }
}
