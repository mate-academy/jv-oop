package core.basesyntax;

abstract class MainApp {
    public abstract void doWork();

    public abstract void stopWork();
}

class Truck extends MainApp {
    @Override
    public void doWork() {
        System.out.println("Machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine stopped its work");
    }
}

class Bulldozer extends MainApp {
    @Override
    public void doWork() {
        System.out.println("Machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine stopped its work");
    }
}

class Excavator extends MainApp {
    @Override
    public void doWork() {
        System.out.println("Machine started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine stopped its work");
    }
}


