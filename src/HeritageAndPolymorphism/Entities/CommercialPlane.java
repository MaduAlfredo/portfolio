package HeritageAndPolymorphism.Entities;

import HeritageAndPolymorphism.ENUMS.Destinations;

class CommercialPlane extends Plane {
    private Integer flightAttendantQuantity;
    private Double ticketValue;
    private Integer passengerQuantity;

    //constructor including superclass' attributes
    public CommercialPlane(
            String planeId,
            String model,
            Destinations destination,
            Integer capacity,
            Integer flightAttendantQuantity,
            Double ticketValue,
            Integer passengerQuantity) {

        super(planeId, model, destination, capacity);

        this.flightAttendantQuantity = flightAttendantQuantity;
        this.ticketValue = ticketValue;
        this.passengerQuantity = passengerQuantity;
    }

    //getters and setters
    public Integer getFlightAttendantQuantity() {
        return flightAttendantQuantity;
    }

    public void setFlightAttendantQuantity(Integer flightAttendantQuantity) {
        this.flightAttendantQuantity = flightAttendantQuantity;
    }

    public Double getTicketValue() {
        return ticketValue;
    }

    public void setTicketValue(Double ticketValue) {
        this.ticketValue = ticketValue;
    }

    public Integer getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(Integer passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    //Overrides the superclass' method and calculates how much profit is made based on the number of passengers
    @Override
    public Double totalFlightProfit()  {

        return ticketValue*passengerQuantity;
    };



}
