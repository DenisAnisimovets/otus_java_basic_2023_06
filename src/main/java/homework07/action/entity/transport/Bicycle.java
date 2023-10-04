package homework07.action.entity.transport;

import homework07.action.Drive;
import homework07.space.Space;

public class Bicycle implements Drive {
    @Override
    public boolean drive(Space space, int distance) {
        if (space == Space.SWAMP) {
            System.out.println("Bicycle can't drive through a swamp");
            return false;
        } else {
            return true;
        }
    }
}