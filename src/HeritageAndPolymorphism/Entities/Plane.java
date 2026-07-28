package HeritageAndPolymorphism.Entities;

import HeritageAndPolymorphism.ENUMS.Destinations;

public abstract class Plane {
    protected String planeId;
    protected String model;
    protected Destinations destination;
    protected Integer capacity;

    //Generalization attributes
    public Plane(
            String planeId,
            String model,
            Destinations destination,
            Integer capacity) {

        this.planeId = planeId;
        this.model = model;
        this.destination = destination;
        this.capacity = capacity;
    }

    public abstract Double totalFlightProfit();


}
