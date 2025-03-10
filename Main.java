// Hospital Locator Starter       A+CR
class Main {
  public static void main(String[] args) {

    String[] aliceSpringsHospitals = {"Alice Springs Hospital", "Alice Springs Private Hospital", "The Centre for Remote Health"};
    CityInAustralia aliceSprings = new CityInAustralia("Alice Springs", 33000, aliceSpringsHospitals);
    System.out.println(aliceSprings);
  }
}