package homework07.action.entity.transport;

import homework07.action.Drive;
import homework07.space.Space;

public class Horse implements Drive {

    private int stamina = 100;
    private final int distanceStamina=2;

    @Override
    public boolean drive(Space space, int distance) {
        if (space == Space.SWAMP) {
            System.out.println("Horse can't drive through a swamp");
            return false;
        }

        if (stamina >= distance * distanceStamina) {
            stamina -= distance * distanceStamina;
            System.out.println("Horse has driven distance - " + distance);
            return true;
        } else {
            System.out.println("Horse hasn't stamina");
            return false;
        }

    }
}
