class Animal {
    private String name;
    private String species;

    // Parameterized constructor for Animal class
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getter methods for name and species
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}

class Cat extends Animal {
    private String breed;

    // Parameterized constructor for Dog class
    public Cat(String name, String species, String breed) {
        super(name, species); // Call the superclass constructor to initialize name and species
        this.breed = breed;
    }

    // Getter method for breed
    public String getBreed() {
        return breed;
    }
}

public class Javaclass {
    public static void main(String[] args) {
        // Create a Dog object
    	Cat Cat = new Cat("Buddy", "Dog", "Golden Retriever");

        // Access and print the fields
        System.out.println("Name: " + Cat.getName());
        System.out.println("Species: " + Cat.getSpecies());
        System.out.println("Breed: " + Cat.getBreed());
    }
}
