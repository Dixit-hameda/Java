class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle("GJ01AB1234", "Honda", "Petrol");

        Car c = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);

        ElectricCar ec = new ElectricCar(
                "GJ03EF9012", "Tesla", "Electric",
                5, true, 75.0, 1.5
        );

        System.out.println("---- Vehicle ----");
        v.displayDetails();

        System.out.println("\n---- Car ----");
        c.displayDetails();

        System.out.println("\n---- Electric Car ----");
        ec.displayDetails();

        System.out.println("\n---- Upcasting ----");
        Vehicle v2 = new Car("GJ04GH3456", "Toyota", "Petrol", 5, true);
        v2.displayDetails();

        System.out.println("\n---- Downcasting ----");
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("Seats: " + c2.numberOfSeats);
            System.out.println("AC: " + c2.ACavailable);
        }
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                double batteryCapacity, double chargingTime) {

        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}
