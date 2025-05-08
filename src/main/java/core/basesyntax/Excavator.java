package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Я - ЭКСКАВАТОР, МЕНЯ ЗОВУТ " + getName() + " И Я ПРИСТУПАЮ К РАБОТЕ!\n"
                + "Расскажу я вам, ребята\n"
                + "Что такое экскаватор\n"
                + "Вот, смотрите, это — он\n"
                + "И красив он и силен\n"
                + "Экскаватор не устанет\n"
                + "И капать не перестанет\n"
                + "Ковш его такой большой\n"
                + "Это очень хорошо\n\n");
    }

    @Override
    public void stopWork() {
        System.out.println("C ТОБОЙ ПРОЩАЕТСЯ ЭКСКАВАТОР " + getName() + "!\n"
                + "Трудно землю рыть лопатой\n"
                + "Нам поможет экскаватор\n"
                + "Он совсем не устает\n"
                + "Роет, песенку поет\n\n");
    }
}
