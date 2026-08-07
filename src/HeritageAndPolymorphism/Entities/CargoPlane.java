package HeritageAndPolymorphism.Entities;

import HeritageAndPolymorphism.ENUMS.Destinations;
import HeritageAndPolymorphism.ENUMS.Planes;

public class CargoPlane extends Plane {

    private String itemType;
    private boolean livingCargo;
    private Double priceByTon;
    private Integer weight;
    private boolean hasInFlightTeam;

    // Constructor including superclass' attributes
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

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public boolean isLivingCargo() {
        return livingCargo;
    }

    public void setLivingCargo(boolean livingCargo) {
        this.livingCargo = livingCargo;
    }

    public Double getPriceByTon() {
        return priceByTon;
    }

    public void setPriceByTon(Double priceByTon) {
        this.priceByTon = priceByTon;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public boolean isHasInFlightTeam() {
        return hasInFlightTeam;
    }

    public void setHasInFlightTeam(boolean hasInFlightTeam) {
        this.hasInFlightTeam = hasInFlightTeam;
    }

    @Override
    public String toString() {
        return "------------------------\n" +
                "\nPlane Identification: " + planeId +
                "\nDestination: " + destination +
                "\nCapacity: " + capacity + " ton(s)" +
                "\nItem(s): " + itemType +
                "\nIs it living cargo? " + livingCargo +
                "\nCost by ton: " + priceByTon +
                "\nTotal weight: " + weight + " ton(s)" +
                "\nIn-flight team: " + hasInFlightTeam +
                "\nFlight Total Profit: US$" + totalFlightProfit();
    }

    // Calculates the profit of the flight and adds 10%
    // in case an in-flight team is necessary
    @Override
    public Double totalFlightProfit() {
        if (hasInFlightTeam) {
            return priceByTon * weight + (priceByTon * weight * 0.1);
        } else {
            return priceByTon * weight;
        }
    }
}