// Abstract Bird class
abstract class Bird {
    public abstract void fly();

    public abstract void makeSound();
}

// Eagle subclass
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle makes a high-pitched screech.");
    }
}

// Hawk subclass
class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("Hawk glides gracefully through the air.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk emits a sharp cry.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Eagle and describe how it flies and makes a sound
        Bird eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();

        // Create a Hawk and describe how it flies and makes a sound
        Bird hawk = new Hawk();
        hawk.fly();
        hawk.makeSound();
    }
}
