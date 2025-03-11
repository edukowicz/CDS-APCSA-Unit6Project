public class InlandCity extends CityInAustralia {
    
    private int distanceToPark;
    private String[] parks;

    public InlandCity(String n, int p, String[] h, int d, String[] pa) {
        super(n, p, h);
        distanceToPark = d;
        parks = pa;
    }

    public String toString() {
        String message = super.toString();
        message += "Distance to the nearest park or reserve (in km): " + distanceToPark + "\n";
        message += "List of nearby parks and reserves: ";
        for(int i =0; i < parks.length; i++){
            message += parks[i] + ", ";
        }
        message+= "\n";
        message+= "\n";
        return message; 
    }
 
}
