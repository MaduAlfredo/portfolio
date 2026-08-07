package HeritageAndPolymorphism.ENUMS;

public enum Destinations {
    NYC("New York", 7859),
    MAD("Madrid", 8722),
    JNB("Johannesburg",7617),
    HND("Haneda", 18602),
    SYD("Sidney", 13061);

    private final int distance;
    private final String destinyName;


    Destinations(String destinyName, int distance) {
        this.destinyName = destinyName;
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }
    public String getDestinyName(){return destinyName;}

    public static Destinations fromString (String  text){

        for(Destinations destinations : Destinations.values()){
            if (destinations.name().equalsIgnoreCase(text.trim()) || destinations.getDestinyName().equalsIgnoreCase(text.trim())){
                return destinations;
            }
        }
        throw new IllegalArgumentException("Invalid destination.");

    }

}
