package homework05;

import homework05.animal.Animal;
import homework05.animal.Cat;
import homework05.animal.Dog;
import homework05.animal.Horse;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik", 10, 100);
        Animal cat2 = new Cat("Tom", 15, 50);
        Animal cat3 = new Cat("Vasy", 5, 25);

        Animal horse1 = new Horse("Barsik", 10, 10, 100);

        Animal dog1 = new Dog("Tom", 15, 10, 50);

        System.out.println(cat1.run(50));
        System.out.println(cat1.run(30));
        System.out.println(cat1.swim(10));

        System.out.println(horse1.swim(10));

        System.out.println(dog1.run(23));

        System.out.println(cat1.info());
        System.out.println(cat2.info());
        System.out.println(cat3.info());

        System.out.println(horse1.info());

        System.out.println(dog1.info());
    }
}
