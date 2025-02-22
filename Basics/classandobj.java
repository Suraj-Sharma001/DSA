package Basics;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.print("Animal Sound!");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);  // call the superclass`s constructor
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!!");
    }

    public void printName() {
        System.out.println("Dog`s name: " + super.name);
    }
}

public class classandobj {
    public static void main(String[] args) {
        Dog doggy1 = new Dog("Shera");
        doggy1.printName();  // Woof!!
        doggy1.makeSound();  // Shera
    }
}
