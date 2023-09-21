class Animal {

    public Animal() {
        System.out.println("Animal created");
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("Dog created");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class SuperKeywordExample {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();
    }
}