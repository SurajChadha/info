package student;

import java.util.*;

class Country{
    String name;
    long population;

    public Country(String name, long population) {
        super();
        this.name = name;
        this.population = population;
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

    // Hashcode method to compute the hash code of Country objects
    public int hashCode() {
        if (this.name.length() % 2 == 0)
            return 30;
        else
            return 90;
    }

    // Equals method to compare Country objects for equality
    public boolean equals(Object obj) {
        if (obj instanceof Country) {
            Country other = (Country) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
        return false;
    }



    public static void main(String[] args) {
        // Creating Country objects
        Country india = new Country("India", 1000);
        Country japan = new Country("Japan", 10000);
        Country france = new Country("France", 2000);
        Country russia = new Country("Russia", 20000);

        // Creating a HashMap to map countries to their capital cities
        HashMap<Country, String> countryCapitalMap = new HashMap<>();

        // Adding key-value pairs to the map
        countryCapitalMap.put(india, "New Delhi");
        countryCapitalMap.put(japan, "Tokyo");
        countryCapitalMap.put(france, "Paris");
        countryCapitalMap.put(russia, "Moscow");

        // Accessing elements from the map
        System.out.println(countryCapitalMap.get(india)); // Output: New Delhi
        System.out.println(countryCapitalMap.get(japan)); // Output: Tokyo
        System.out.println(countryCapitalMap.get(france)); // Output: Paris
        System.out.println(countryCapitalMap.get(russia)); // Output: Moscow
    }
}

