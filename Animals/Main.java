package Animals;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 100, 0);
        Dog dog = new Dog("Lakki", 500, 10);

        System.out.println(cat.name + " -> " + "пробежал " + cat.run + " м" + ", " + "не умеет плавать");
        System.out.println(dog.name + " -> " + "пробежал " + dog.run + " м" + ", " + "проплыл " + dog.sail + " м");
    }
}

