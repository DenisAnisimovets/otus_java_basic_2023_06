package homework07.action.entity.transport;

import homework07.action.Drive;
import homework07.space.Space;

public class Rover implements Drive {

    private int petrol = 100;
    private final int petrolConsumption =1;
    @Override
    public boolean drive(Space space, int distance) {
        if (petrol >= distance * petrolConsumption) {
            petrol -= distance * petrolConsumption;
            System.out.println("Rover has driven distance - " + distance);
            return true;
        } else {
            System.out.println("Rover hasn't petrol");
            return false;
        }
    }
}
