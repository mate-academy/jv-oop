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
    public abstract static class Machine {
        public abstract void doWork();

        public abstract void stopWork();
    }

    static class Track extends Machine {
        @Override
        public void doWork() {
            System.out.println("Track has started");
        }

        @Override
        public void stopWork() {
            System.out.println("Track has stopped");
        }
    }

    static class Bulldozer extends Machine {
        @Override
        public void doWork() {
            System.out.println("Bulldozer has started");
        }

        @Override
        public void stopWork() {
            System.out.println("Bulldozer has stopped");
        }
    }

    static class Excavator extends Machine {
        @Override
        public void doWork() {
            System.out.println("Excavator has started");
        }

        @Override
        public void stopWork() {
            System.out.println("Excavator has stopped");
        }
    }

    public static void main(String[] args) {
        Machine ford = new Track();
        Machine johnDeere = new Bulldozer();
        Machine caterpillar = new Excavator();
        ford.doWork();
        johnDeere.doWork();
        caterpillar.doWork();
        ford.stopWork();
        johnDeere.stopWork();
        caterpillar.stopWork();
    }
}
