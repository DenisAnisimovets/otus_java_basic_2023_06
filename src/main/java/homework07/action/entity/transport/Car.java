package homework07.action.entity.transport;

import homework07.action.Drive;
import homework07.space.Space;

public class Car implements Drive {

    private int petrol = 100;
    private final int petrolConsumption = 1;
    @Override
    public boolean drive(Space space, int distance) {
        if (space == Space.DEFENSE_FOREST || space == Space.SWAMP) {
            System.out.println("Car can't drive through a dense forest ");
            return false;
        }
        if (petrol >= distance * petrolConsumption) {
            petrol -= distance * petrolConsumption;
            System.out.println("Car has driven distance - " + distance);
            return true;
        } else {
            System.out.println("Car hasn't petrol");
            return false;
        }
    }
}
