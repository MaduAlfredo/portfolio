package HeritageAndPolymorphism.ENUMS;

public enum RentingType {
    DESTINATION,
    DAY,

    private final String rentingType;

    RentingType(String rentingType){this.rentingType = rentingType};

    public String getRentingType (){return  rentingType};

    public static RentingType fromString(String text) {
        for (RentingType rentingType = RentingType.values()) {
            if(rentingType.getRentingType().equalsIgnoreCase(text.trim())){
                return rentingType;
            }
        }
        throw new IllegalArgumentException("Invalid renting type.");

    }

}
