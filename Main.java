// Hospital Locator Starter       A+CR
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    String[] aliceSpringsHospitals = {"Alice Springs Hospital", "Alice Springs Private Hospital", "The Centre for Remote Health"};
    String[] aliceSpringsParks = {"Olive Pink Botanical Garden", "Alice Springs Desert Park", "Simpsons Gap"};
    CityInAustralia aliceSprings = new InlandCity("Alice Springs", 33000, aliceSpringsHospitals, 1, aliceSpringsParks);

    String[] bendigoHospitals = {"Bendigo Base Hospital", "St John of God Bendigo Hospital", "Bendigo Private Hospital"};
    String[] bendigoParks = {"Rosalind Park", "Bendigo Regional Park", "Greater Bendigo National Park", "Kangaroo Flat Bushland Reserve", "Huntly Nature Reserve"};
    CityInAustralia bendigo = new InlandCity("Bendigo", 122647, bendigoHospitals, 1, bendigoParks);

    String[] brisbaneHospitals = {"Royal Brisbane and Women's Hospital", "Princess Alexandra Hospital", "The Prince Charles Hospital"};
    String[] brisbaneBeaches = {"Shorncliffe Beach", "Nudgee Beach", "Suttons Beach"};
    CityInAustralia brisbane = new CoastalCity("Brisbane", 2280000, brisbaneHospitals, 15, brisbaneBeaches);

    String[] darwinHospitals = {"Royal Darwin Hospital", "Darwin Private Hospital", "Palmerston Regional Hospital"};
    String[] darwinBeaches = {"Mindil Beach", "Casuarina Beach", "Vesteys Beach"};
    CityInAustralia darwin = new CoastalCity("Darwin", 147000, darwinHospitals, 0, darwinBeaches);

    String[] melbourneHospitals = {"The Royal Melbourne Hospital", "St Vincent's Hospital Melbourne", "The Alfred Hospital"};
    String[] melbourneBeaches = {"St Kilda Beach", "Brighton Beach", "Williamstown Beach"};
    CityInAustralia melbourne = new CoastalCity("Melbourne", 5150000, melbourneHospitals, 0, melbourneBeaches);
    
    String[] perthHospitals = {"Royal Perth Hospital", "Sir Charles Gairdner Hospital", "Fiona Stanley Hospital"};
    String[] perthBeaches = {"Cottesloe Beach", "Scarborough Beach", "City Beach"};
    CityInAustralia perth = new CoastalCity("Perth", 2100000, perthHospitals, 0, perthBeaches);

    String[] rockhamptonHospitals = {"Rockhampton Hospital", "Hillcrest Private Hospital"};
    String[] rockhamptonParks = {"Mount Archer National Park", "Rockhampton Botanic Gardens"};
    CityInAustralia rockhampton = new InlandCity("Rockhampton", 82000, rockhamptonHospitals, 1, rockhamptonParks);

    String[] sydneyHospitals = {"Royal Prince Alfred Hospital", "St Vincent’s Hospital", "Westmead Hospital", "Sydney Children’s Hospital"};
    String[] sydneyBeaches = {"Bondi Beach", "Manly Beach", "Coogee Beach", "Bronte Beach", "Cronulla Beach"};
    CityInAustralia sydney = new CoastalCity("Sydney", 5300000, sydneyHospitals, 5, sydneyBeaches);
    
    String[] toowoombaHospitals = {"Toowoomba Hospital", "St. Vincent’s Private Hospital Toowoomba", "St. Andrew’s Toowoomba Hospital"};
    String[] toowoombaParks = {"Queens Park", "Laurel Bank Park", "Picnic Point Parklands"};
    CityInAustralia toowoomba = new InlandCity("Toowoomba", 128377, toowoombaHospitals, 50, toowoombaParks);

    String[] waggaWaggaHospitals = {"Wagga Wagga Base Hospital"};
    String[] waggaWaggaParks = {"Webb Park", "Wilga Park", "Willans Hill"};
    CityInAustralia waggaWagga = new InlandCity("Wagga Wagga", 69000, waggaWaggaHospitals, 30, waggaWaggaParks);

    ArrayList<CityInAustralia> cities = new ArrayList<CityInAustralia>();
    cities.add(aliceSprings);
    cities.add(bendigo);
    cities.add(brisbane);
    cities.add(darwin);
    cities.add(melbourne);
    cities.add(perth);
    cities.add(rockhampton);
    cities.add(sydney);
    cities.add(toowoomba);
    cities.add(waggaWagga);

    for(int i = 0; i < cities.size(); i++) {
      System.out.println(cities.get(i));
    }

  }
}