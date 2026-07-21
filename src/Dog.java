public class Dog extends Animal {

    Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void move() {
        System.out.println(name + " dog is running.");

    }
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "---- Dog ---- " + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight + " kg" +"\n";
    }
}
