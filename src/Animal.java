public class Animal {

    String name;
    int age;
    double weight;

    Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void move() {
        System.out.println("This animal is moving.");
    }

    void makeSound() {
        System.out.println("This animal is making sound.");
    }
}
