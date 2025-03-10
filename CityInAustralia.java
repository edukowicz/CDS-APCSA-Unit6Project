class CityInAustralia {
	
    private String name;
    private int population;
    private String[] hospitals;

    public CityInAustralia(String n, int p, String[] h){
        name = n;
        population = p;
        hospitals = h;
    }

    public String toString(){
        String message = "City: " + name + "\n";
        message += "Population: " + population + "\n";
        message += "List of hospitals: ";
        for(int i =0; i < hospitals.length; i++){
            message += hospitals[i] + ", ";
        }
        message+= "\n";
        return message;
    }
    

}