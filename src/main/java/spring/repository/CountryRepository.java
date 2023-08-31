package spring.repository;

import spring.domain.Country;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CountryRepository {

  static List<Country> countries =
      Arrays.asList(
          new Country("Afghanistan", "Kabul"),
          new Country("Bosnia and Herzegovina", "Sarajevo"),
          new Country("Cuba", "Havana"),
          new Country("Croatia", "Zagreb"),
          new Country("Haiti", "Port-au-Prince"),
          new Country("Kyrgyzstan", "Bishkek"),
          new Country("Portugal", "Lisbon"));

  public List<Country> findAll() {
    return countries;
  }

  public void save(Country country) {
    countries.add(country);
  }
}
