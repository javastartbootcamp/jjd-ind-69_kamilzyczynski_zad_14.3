public class Country {
    private String countryCode;
    private String name;
    private long population;

    public Country(String countryCode, String name, long population) {
        this.countryCode = countryCode;
        this.name = name;
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (" + countryCode + ") ma " + population + " ludności.";
    }
}
