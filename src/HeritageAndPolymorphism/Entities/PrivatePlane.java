package HeritageAndPolymorphism.Entities;

import HeritageAndPolymorphism.ENUMS.Destinations;
import HeritageAndPolymorphism.ENUMS.Planes;
import HeritageAndPolymorphism.ENUMS.RentingType;

public class PrivatePlane extends Plane {
    //changeable attributes
    private int passengerQuantity;
    private boolean hasCargo;
    private Integer daysQuantity;

    //unchangeable attributes
    private final RentingType type;

    //constants
    private static final double PER_KM_COST = 0.46;
    private static final int PER_DAY_KM = 8000;

    //Constructor including  the superclass attributes
    public PrivatePlane(
            String planeId,
            Planes model,
            Destinations destination,
            Integer capacity,
            int passengerQuantity,
            boolean hasCargo,
            RentingType type) {

        super(planeId, model, destination, capacity);

        this.passengerQuantity = passengerQuantity;
        this.hasCargo = hasCargo;
        this.type = type;
    }

    //getters and setters
    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(int passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public boolean isHasCargo() {
        return hasCargo;
    }

    public void setHasCargo(boolean hasCargo) {
        this.hasCargo = hasCargo;
    }

    public RentingType getType() {
        return type;
    }

    public Integer getDaysQuantity() {
        return daysQuantity;
    }

    public void setDaysQuantity(Integer daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    //Override the superclass method and calculates profit base on type of flight
    @Override
    public Double totalFlightProfit() {
            switch (type) {
            //If the flight renting type is destinations calculates the price profit based on the distances established in Destinations' ENUM
                case DESTINATION:
                    return destination.getDistance() * PER_KM_COST;

            //If the renting type is per day calculates the profit based on the prefixed kilometer price / kms per day
                case DAY:
                    //If the quantity of days is null returns a message
                    if (daysQuantity == null) {
                        throw new IllegalStateException("The number of rental days must be informed.");
                    }
                    return PER_DAY_KM  * PER_KM_COST  * daysQuantity;

                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
    }
}
