

public class Main {

    public static void main(String[] args) {
        Car car = new Car(2,"Tesla","S",6,8,5 );
        car.refuel(3);
        car.displayInfo();
        car.startEngine();
        car.stopEngine();
        System.out.println("_ _ _ _ _ _ _ _");

        Aircraft aircraft = new Aircraft(3, "Diamond", "№269JR", 4, 500, false);
        aircraft.displayInfo();
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.land();
        aircraft.stopEngine();
        System.out.println("_ _ _ _ _ _ _ _");

        Boat boat = new Boat(5, "Betram", "№28", 8, 100, false);
        boat.displayInfo();
        boat.startEngine();
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopEngine();
        System.out.println("_ _ _ _ _ _ _ _");

    }
    
}