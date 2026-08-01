package HeritageAndPolymorphism.ENUMS;

public enum Planes {
    AIRBUS_A320("Airbus A320"),
    BOEING_747_8F("Boeing 747-8F"),
    CESSNA_CITATION_X("Cessna Citation X");

    private final String planeType;
    
    Planes(String planeType) { this.planeType = planeType;}
    
    public String getPlaneType(){return  planeType; }

    public static Planes fromString(String text) {

        for (Planes plane : Planes.values()) {

            if (plane.getPlaneType().equalsIgnoreCase(text.trim())) {
                return plane;
            }
        }

        throw new IllegalArgumentException("Invalid plane model.");
    }
}
