public class Boat extends Vehicle implements Swimmable {
    int maxSpeed;
    boolean isSailing;

    Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing){
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
    }

    @Override
    void displayInfo() {
        System.out.println("ID: "         + super.id);
        System.out.println("Brand: "      + super.brand);
        System.out.println("Model: "      + super.model);
        System.out.println("Год выпуска " + super.year);


        System.out.println("Максимальная скорость на воде " + maxSpeed);
        if(this.isSailing)
            System.out.println("Лодка движется по воде");
        else
            System.out.println("Лодка не двигается по воде");
    }
    
    @Override
    public void startSwimming() {
        System.out.println("Лодка начинает свое движение");
        
    }

    @Override
    public void stopSwimming() {
        System.out.println("Лодка останавливается");
    }

    @Override
    void startEngine() {
        System.out.println("Запускается двигатель лодки");
    }

    @Override
    void stopEngine() {
        System.out.println("Двигатель лодки остановливается");
    }

}
