abstract class Machines {
        public abstract void doWork();
        public abstract void stopWork();
}

class Track extends Machines {
        @Override
        public void doWork() {
            System.out.println("Truck begun working.");
        }

        public void stopWork() {
            System.out.println("Truck stopped working.");
        }
}

class Bulldozer extends Machines {
        @Override
        public void doWork() {
            System.out.println("Bulldozer begun working.");
        }

        @Override
        public void stopWork() {
            System.out.println("Bulldozer stopped working.");
        }
}

class Excavator extends Machines {
        @Override
        public void doWork() {
            System.out.println("Excavator begun working.");
        }

        @Override
        public void stopWork() {
            System.out.println("Excavator stopped working.");
        }
}
