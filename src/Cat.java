public class Cat extends Animal {

    Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void move() {
        System.out.println(name + " cat is walking.");

    }
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "---- Cat ---- " + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight + " kg" + "\n";
    }
}
