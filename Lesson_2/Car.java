
public class Car extends Vehicle {
    int fuelCapacity;
    int carrentFuelLevel;

    Car(int id, String brand, String model, int year, int fuelCapacity, int carrentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.carrentFuelLevel = carrentFuelLevel;

    }

    @Override
    void displayInfo() {
        System.out.println("ID: "         + super.id);
        System.out.println("Brand: "      + super.brand);
        System.out.println("Model: "      + super.model);
        System.out.println("Год выпуска " + super.year);


        System.out.println("Емкост топливного бака: "  + fuelCapacity);
        System.out.println("Уровень топливного бака: " + carrentFuelLevel);
    }

    @Override
    void startEngine() {
        System.out.println("Двигател автомобиля запушен");
    }

    @Override
    void stopEngine() {
        System.out.println("Двигатель автомобиля остановлен");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Скорость автомобиля увеличен на " + speed);
    }

    @Override
    void brake() {
        System.out.println("Автомобил остоновил движение");
    }

    void refuel(int liters) {
        carrentFuelLevel += liters;
        System.out.println("Уровень топлива увеличен на " + liters);
    }
}
