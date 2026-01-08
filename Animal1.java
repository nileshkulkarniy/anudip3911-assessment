
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Animal1 {
    public static void main(String[] args) {

        Animal a;

        a = new Animal();
        a.makeSound();

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();
    }
}
