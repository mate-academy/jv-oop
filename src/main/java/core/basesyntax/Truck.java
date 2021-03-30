package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void doWork() {
        System.out.println("Я - ГРУЗОВИК, МЕНЯ ЗОВУТ " + getName() + " И Я ПРИСТУПАЮ К РАБОТЕ!\n"
                + "Я грузовик\n"
                + "Предназначен, чтобы\n"
                + "Собрать все камни\n"
                + "Подбрось и ты мне\n\n");
    }

    @Override
    public void stopWork() {
        System.out.println("C ТОБОЙ ПРОЩАЕТСЯ ГРУЗОВИК " + getName() + "!\n"
                + "Кузов разбит, кровоточит\n"
                + "Продвигаюсь, как ни странно\n"
                + "Это мой план, на\n\n");
    }
}
