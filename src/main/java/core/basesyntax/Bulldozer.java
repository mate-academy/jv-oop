package core.basesyntax;

public class Bulldozer extends Machine {

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
        System.out.println("Я - БУЛЬДОЗЕР, МЕНЯ ЗОВУТ " + getName() + " И Я ПРИСТУПАЮ К РАБОТЕ!\n"
                + "Правильно, ну конечно, это бульдозер!\n"
                + "А у нас во дворе строят новый дом\n"
                + "И поэтому так стало шумно в нём!\n"
                + "Вот приехал он и сравнял бугры\n"
                + "Чтобы в нашем дворе доим построили!\n"
                + "Бульдозер, бульдозер сильнее не найти!\n"
                + "Он лопатой своей сдвинет всё на пути.\n\n");
    }

    @Override
    public void stopWork() {
        System.out.println("C ТОБОЙ ПРОЩАЕТСЯ БУЛЬДОЗЕР " + getName() + "!\n"
                + "Вот у всех на виду\n"
                + "во дворе рычит бу- ль- до- зер!\n"
                + "Бульдозер очень сильный!\n"
                + "А что дальше? Кто дальше будет строить дом?\n\n");
    }
}
