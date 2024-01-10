import java.io.*;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;
import java.util.stream.*;

import lab.dao.InMemoryWorldDao;
import lab.domain.City;
import lab.domain.Country;

public class Main {

    public static void highestPopCityCountry(Map<String, Country> mappedCountries) {

        Map<String, String> maxPop = mappedCountries.values().stream().collect(Collectors.toMap(
                        Country::getName,
                        c -> {
                            List<City> dummyCity = c.getCities();
                            return dummyCity.stream().
                                    max(Comparator.comparing(City::getPopulation)).
                                    map(City::getName)
                                    .orElse("There is no Cities");
                        }
                ));
        maxPop.forEach((key, val) -> {
            System.out.println("Key: " + key + "     Value: " + val);
        });
    }

    public static void highestPopCityContinent(Set<String> continents, Map<String, Country> mappedCountries) {
        Map<String, List<Country>> mappedCountriesToContinents = continents.stream().collect(Collectors.toMap(
                c -> c,
                contnent -> {
                    List<Country> cntries = new ArrayList<>();
                    cntries.addAll
                            (mappedCountries.values().stream()
                                    .filter(ctr -> ctr.getContinent().equals(contnent))
                                    .toList());
                    return cntries;
                }
        ));
        mappedCountriesToContinents.forEach((continent, countries) -> {
            System.out.println(continent + ":" + countries);
        });
        Map<String, String> maxPop = mappedCountriesToContinents.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                ctrys -> {
                    List<City> allCities = new ArrayList<>();
                    ctrys.getValue().forEach((c) -> {
                        allCities.addAll(c.getCities());
                    });
                    System.out.println(ctrys.getValue());
                    return allCities.stream().max(Comparator.comparing(City::getPopulation))
                            .map(City::getName).orElse("");
                }
        ));
        maxPop.forEach((key, val) -> {
            System.out.println("Key: " + key + "     Value: " + val);
        });
    }

    public static void highestPopCapital(Map<String, Country> mappedCountries) {
        List<City> capitals = new ArrayList<>();
        mappedCountries.values().forEach(country ->
                capitals.add(country.getCities().stream().
                        filter(city -> city.getId() == country.getCapital()).
                        findFirst().orElse(null)));
        //capitals = capitals.stream().filter(Objects::nonNull).toList();
        //capitals.stream().filter(Objects::nonNull).sorted(Comparator.comparing(City::getName))
        //    .peek(city -> System.out.println(city.getName())).toList();
        City highestPop = capitals.stream().
                filter(Objects::nonNull).
                max(Comparator.comparing(City::getPopulation)).
                orElse(new City(0, "", "", 0));
        System.out.println(highestPop.getName());
        System.out.println(highestPop.getPopulation());

    }

    public static void main(String[] args) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance ();

        //highestPopCityCountry(worldDao.getCountries());
        //highestPopCityContinent(worldDao.getContinents(), worldDao.getCountries());
        highestPopCapital(worldDao.getCountries());
    }
}