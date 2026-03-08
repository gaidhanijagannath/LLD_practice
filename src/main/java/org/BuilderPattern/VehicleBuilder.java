package org.BuilderPattern;

public class VehicleBuilder {
    public static void main(String[] args) {


        Car.CarBuilder C = new Car.CarBuilder();
        Car car = C.setEngine("V8")
                .setSeats(4)
                .setWheelsType("Alloy")
                .setNavigationSystem("GPS")
                .setSunroof(true).build();

        System.out.println("Car Details:");
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Seats: " + car.getSeats());
        System.out.println("Wheels Type: " + car.getWheelsType());
        System.out.println("Sunroof: " + car.isSunroof());
        System.out.println("Navigation System: " + car.getNavigationSystem());
    }
}
