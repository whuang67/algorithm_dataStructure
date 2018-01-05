class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinders = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() { return this.name+" -> startEngine()"; }
    public String accelerate() { return this.name+" -> accelerate()"; }
    public String brake() { return this.name+" -> brake()"; }

    public String getName() { return name; }
    public int getCylinders() { return cylinders; }
    public boolean isEngine() { return engine; }
    public int getWheels() { return wheels; }
}
// -------------------
class Mitsubishi extends Car {
    public Mitsubishi() { super("Mitshuishi", 4); }

    @Override
    public String startEngine() { return getClass().getSimpleName()+" -> startEngine()"; }
    @Override
    public String accelerate() { return getClass().getSimpleName()+" -> accelerate()"; }
    @Override
    public String brake() { return getClass().getSimpleName()+"-> brake()"; }
}
class Ford extends Car {
    public Ford() { super("Ford", 6); }

    @Override
    public String startEngine() { return getClass().getSimpleName()+" -> startEngine()"; }
    @Override
    public String accelerate() { return getClass().getSimpleName()+" -> accelerate()"; }
    @Override
    public String brake() { return getClass().getSimpleName()+" -> brake"; }
}

class Holden extends Car {
    public Holden() { super("Holden", 6); }

    @Override
    public String startEngine() { return getClass().getSimpleName()+" -> startEngine()"; }
    @Override
    public String accelerate() { return getClass().getSimpleName()+" -> accelerate()"; }
    @Override
    public String brake() { return getClass().getSimpleName()+" -> brake()"; }
}

class Toyota extends Car {
    public Toyota() { super("Toyota", 6); }
    // No overrides
}


public class Main {
    public static void main(String[] args){
//        Car car = new Car("shit", 9);
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//        System.out.println(car.startEngine());

        for(int i = 1; i < 11; i++) {
            Car car = randomVehicle();
            printOut(car);
            System.out.println("------- "+i+" -------");
        }

    }

    public static Car randomVehicle() {
        int randomNum = (int) (Math.random()*5)+1;
        switch(randomNum) {
            case 1:
                return new Mitsubishi();
            case 2:
                return new Ford();
            case 3:
                return new Holden();
            case 4:
                return new Toyota();
            default:
                return new Car("General Car", 9);
        }
    }
    public static void printOut(Car car) {
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}
