package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}

