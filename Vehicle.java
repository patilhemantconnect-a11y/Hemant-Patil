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
}


class Car extends Vehicle {

    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) {

        super(vehicleNumber, brand, fuelType); 
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }


    @Override
    void displayDetails() {
        super.displayDetails(); // call parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {

    double batteryCapacity;
    double chargingTime;


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
        System.out.println("Charging Time: " + chargingTime + " hrs");
    }
}

public class Main {
    public static void main(String[] args) {

     
        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");

      
        Vehicle v2 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);

     
        Vehicle v3 = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 1.5);

        System.out.println("---- Vehicle Details ----");
        v1.displayDetails();

        System.out.println("\n---- Car Details ----");
        v2.displayDetails();

        System.out.println("\n---- Electric Car Details ----");
        v3.displayDetails();

     
        if (v2 instanceof Car) {
            Car c = (Car) v2;
            System.out.println("\n(Downcasting Car) Seats: " + c.numberOfSeats);
        }

        if (v3 instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) v3;
            System.out.println("(Downcasting ElectricCar) Battery: " + ec.batteryCapacity + " kWh");
        }
    }
}