package org.BuilderPattern;

public class Car {
    private String Engine;
    private String Wheels;
    private boolean Sunroof;
    private int Seats;
    private String navigationSystem;

    private Car(CarBuilder builder) {
       this.Engine = builder.Engine;
        this.Wheels = builder.WheelsType;
        this.Sunroof = builder.Sunroof;
        this.Seats = builder.Seats;
        this.navigationSystem = builder.navigationSystem;
    }

    public String getWheelsType() {
        return Wheels;
    }

    public boolean isSunroof() {
        return Sunroof;
    }

    public String getEngine() {
        return Engine;
    }

    public String getNavigationSystem() {
        return navigationSystem;
    }

    public int getSeats() {
        return Seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Engine='" + Engine + '\'' +
                ", WheelsType='" + Wheels + '\'' +
                ", Sunroof=" + Sunroof +
                ", Seats=" + Seats +
                ", navigationSystem='" + navigationSystem + '\'' +
                '}';
    }

    static  class CarBuilder {
        /* String Engine = "V8";
         String WheelsType = "Alloy";
         boolean Sunroof = false;
         int Seats = 4;
         String navigationSystem = "Standard";*/

        String Engine ;
        String WheelsType;
        boolean Sunroof ;
        int Seats ;
        String navigationSystem ;


        public CarBuilder setEngine(String engine) {
            this.Engine = engine;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.Sunroof = sunroof;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.Seats = seats;
            return this;
        }

        public CarBuilder setWheelsType(String wheelsType) {
            this.WheelsType = wheelsType;
            return this;
        }

        public CarBuilder setNavigationSystem(String navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

