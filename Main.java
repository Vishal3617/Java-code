class Vehicle {
    private String make;
    private String model;

    // Parameterized constructor for Vehicle class
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter methods for make and model
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

class Car extends Vehicle {
    private int year;

    // Parameterized constructor for Car class
    public Car(String make, String model, int year) {
        super(make, model); // Call the superclass constructor to initialize make and model
        this.year = year;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Forturener", 2023);

        // Access and print the fields
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}
