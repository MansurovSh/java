

/*
 * абстрактный класс двигатель
 */
public abstract class Vehicle {
    protected int id;
    protected String brand;
    protected String model;
    protected int year;


    Vehicle(int id, String brand, String model, int year){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    void startEngine()  {} //  запуск двигателя (реализация в подклассах).

    void stopEngine() {}  //   остановка двигателя (реализация в подклассах).

    void accelerate(int speed) {}  // увеличение скорости на указанное значение (реализация в подклассах).

    void brake()  {}     //    прекращение движения (реализация в подклассах).

    abstract void displayInfo(); // вывод информации о транспортном средстве (реализация в подклассах).

}
