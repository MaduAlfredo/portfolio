package HeritageAndPolymorphism.Entities;

import HeritageAndPolymorphism.ENUMS.Destinations;
import HeritageAndPolymorphism.ENUMS.Planes;

public abstract class Plane {
    protected String planeId;
    protected Planes model;
    protected Destinations destination;
    protected Integer capacity;

    //Generalization attributes
    public Plane(
            String planeId,
            Planes model,
            Destinations destination,
            Integer capacity) {

        this.planeId = planeId;
        this.model = model;
        this.destination = destination;
        this.capacity = capacity;
    }

    public abstract String toString();

    public abstract Double totalFlightProfit();


}
