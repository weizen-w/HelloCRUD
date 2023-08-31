package spring.service;

import spring.domain.Country;
import spring.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

  @Autowired private CountryRepository countryRepository;

  public List<Country> findAll() {
    return countryRepository.findAll();
  }

  public void add(Country country) {
    countryRepository.save(country);
  }
}
