// package Lesson_2;

class Aircraft extends Vehicle implements Flyable  {
    int maxAltitude;
    protected boolean isFlying;

    Aircraft(int id, String brand, String model, int year, int maxAltitude, boolean isFlying){
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }

    @Override
    public void takeOff() {
        System.out.println("Самолет взлетел");
        
    }

    @Override
    public void land() {
        System.out.println("Самолет приземлился ");
    }

    @Override
    void displayInfo() {
        System.out.println("ID: "         + super.id);
        System.out.println("Brand: "      + super.brand);
        System.out.println("Model: "      + super.model);
        System.out.println("Год выпуска " + super.year);


        System.out.println("Максимальная высота полета равна " + maxAltitude);
        if(this.isFlying)
            System.out.println("Cамолет летит ");
        else
            System.out.println("Самолет не летит ");

    }

    @Override
    void startEngine() {
        System.out.println("Двигател самолета запушен");
    }

    @Override
    void stopEngine() {
        System.out.println("Двигател самолета остановлен");
    }

    void isFlying(boolean isFlying){
        this.isFlying = isFlying;
    }
    
 }
