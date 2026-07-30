package HeritageAndPolymorphism.ENUMS;

public enum Destinations {
    NYC(7859),
    MAD(8722),
    JNB(7617),
    HND(18602),
    SYD(13061);

    private final int distance;

    Destinations(int distance) {
        this.distance =distance;
    }

    public int getDistance(){
        return distance;
    }

    public static Destinations fromString (String  text){

        for(Destinations destinations : Destinations.values()){
            if (destinations.name().equalsIgnoreCase(text.trim())){
                return destinations;
            }
        }
        throw new IllegalArgumentException("Invalid destination.");

    }

}
