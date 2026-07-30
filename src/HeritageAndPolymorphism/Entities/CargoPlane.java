package HeritageAndPolymorphism.Entities;

import HeritageAndPolymorphism.ENUMS.Destinations;
import HeritageAndPolymorphism.ENUMS.Planes;

public class CargoPlane extends Plane{
    private String itemType;
    private boolean livingCargo;
    private Double priceByTon;
    private Integer weight;
    private boolean hasInFlightTeam;

    //Constructor including superclass' attributes
    public CargoPlane(
            String planeId,
            Planes model,
            Destinations destination,
            Integer capacity,
            String itemType,
            boolean livingCargo,
            Double priceByTon,
            Integer weight,
            boolean hasInFlightTeam) {

        super(planeId, model, destination, capacity);

        this.itemType = itemType;
        this.livingCargo = livingCargo;
        this.priceByTon = priceByTon;
        this.weight = weight;
        this.hasInFlightTeam = hasInFlightTeam;
    }

    //calculates the profit of the flight and adds 10% in case if an in flight team is necessary
    @Override
    public Double totalFlightProfit() {
        if (hasInFlightTeam == true) {
            return priceByTon*weight+(priceByTon*weight*0.1);
        }else {
            return priceByTon*weight;
        }
    }
}
