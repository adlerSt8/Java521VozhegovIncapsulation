public class CountryData {
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public double getAreaSquare() {
        return areaSquare;
    }

    public void setAreaSquare(double areaSquare) {
        this.areaSquare = areaSquare;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean getIsAccessSea() {
        return accessSea;
    }

    public void setAccessSea(boolean accessSea) {
        this.accessSea = accessSea;
    }

    private String countryName;
    private int populationSize;
    private double areaSquare;
    private String nameCapital;
    private boolean accessSea;

    public CountryData(String nameCountry){
        this.countryName = nameCountry;
    }


}
