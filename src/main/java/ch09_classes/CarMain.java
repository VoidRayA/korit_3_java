package ch09_classes;

public class CarMain {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.color = "빨강";
        myCar.speed = 160;
        Car youCar = new Car();
        youCar.color = "노랑";
        youCar.speed = 180;

        myCar.drive();
        youCar.brake();
        myCar.displayInfo();
        youCar.displayInfo();
    }
}
