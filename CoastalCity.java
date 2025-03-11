public class CoastalCity extends CityInAustralia{

    private int distanceToWater;
    private String[] beaches;

    public CoastalCity(String n, int p, String[] h, int d, String[] b) {
        super(n, p, h);
        distanceToWater = d;
        beaches = b;
    }

    public String toString() {
        String message = super.toString();
        message += "Distance to the ocean (in km): " + distanceToWater + "\n";
        message += "List of nearby beaches: ";
        for(int i =0; i < beaches.length; i++){
            message += beaches[i] + ", ";
        }
        message+= "\n";
        message+= "\n";
        return message;
    }

}