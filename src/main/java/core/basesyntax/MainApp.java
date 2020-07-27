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
abstract class Machine {
    public abstract void doWork();
    public abstract void stopWork();
}
class Track extends Machine{

    @Override
    public void doWork() {
        System.out.println("The track started working");
    }

    @Override
    public void stopWork() {
        System.out.println("The track stopped working");
    }
}
class Bulldozer extends Machine{

    @Override
    public void doWork() {
        System.out.println("The bulldozer started working");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stopped working");
    }
}
class Excavator extends Machine{

    @Override
    public void doWork() {
        System.out.println("The excavator started working");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stopped working");
    }
}
public class MainApp {
    public static void main(String[] args) {
        Track track = new Track();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        track.doWork();
        bulldozer.doWork();
        excavator.doWork();
        track.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
