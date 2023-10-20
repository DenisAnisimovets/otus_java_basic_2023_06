package homework07.action.entity;

import homework07.action.Drive;
import homework07.space.Space;

public class Human {
    private final String name;
    private int stamina = 25;
    private int walkStamina = 1;

    private Drive currentTransport;

    public String getName() {
        return name;
    }

    public Drive getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Drive currentTransport) {
        this.currentTransport = currentTransport;
    }

    public Human(String name, Drive currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public void drive(Drive currentTransport, Space space, int distance) {
        if (currentTransport != null) {
            currentTransport.drive(space, distance);
        } else {
            walk(distance);
        }
    }

    public void drive(Space space, int distance) {
        if (currentTransport != null) {
            currentTransport.drive(space, distance);
        } else {
            walk(distance);
        }
    }

    public boolean walk(int distance) {
        if (stamina >= walkStamina * distance) {
            stamina -= walkStamina * distance;
            System.out.println("Human has walked");
            return true;
        } else {
            System.out.println("Human wanna rest and beers");
            return false;
        }
    }
}
