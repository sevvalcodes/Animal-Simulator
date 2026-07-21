public class Bird extends Animal {

    Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void move() {
        System.out.println(name + " bird is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Cik Cik!");
    }

    @Override
    public String toString() {
        return "---- Bird ---- " + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight + " kg" + "\n";
    }
}
