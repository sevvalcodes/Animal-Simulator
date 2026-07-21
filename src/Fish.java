public class Fish extends Animal {

    Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void move() {
        System.out.println(name + " fish is swimming");
    }

    @Override
    void makeSound() {
        System.out.println("Blub!");
    }

    @Override
    public String toString() {
        return "---- Fish ---- " + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight + " kg" + "\n";
    }
}
