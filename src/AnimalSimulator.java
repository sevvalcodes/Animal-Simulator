public class AnimalSimulator {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", 3, 18.5);
        Cat cat = new Cat("Luna", 2, 4.2);
        Bird bird = new Bird("Sandy", 4, 1.5);
        Fish fish = new Fish("Nemo", 1, 0.8);

        System.out.println(dog);
        dog.move();
        dog.makeSound();
        System.out.println();
        System.out.println(cat);
        cat.move();
        cat.makeSound();
        System.out.println();
        System.out.println(bird);
        bird.move();
        bird.makeSound();
        System.out.println();
        System.out.println(fish);
        fish.move();
        fish.makeSound();

    }
}
