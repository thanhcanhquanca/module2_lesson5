package StaticProperty;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Na", "Vai");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mit","Buoi chua");
        System.out.println(Car.numberOfCars);
    }
}
