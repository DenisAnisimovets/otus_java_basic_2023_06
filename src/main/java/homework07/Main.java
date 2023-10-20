package homework07;

import homework07.action.entity.Human;
import homework07.action.entity.transport.Car;
import homework07.action.entity.transport.Horse;
import homework07.space.Space;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Vany", new Car());

        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 10));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 40));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 90));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 10));

        human1.setCurrentTransport(new Horse());
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 10));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 20));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 200));

        human1.setCurrentTransport(null);

        human1.drive( Space.PLAIN, 10);

    }
}
