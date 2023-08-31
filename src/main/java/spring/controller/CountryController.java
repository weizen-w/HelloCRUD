package spring.controller;

import spring.domain.Country;
import spring.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {

  @Autowired CountryService countryService;

  @GetMapping("/countries")
  public String listForm(Model model) {
    List<Country> countries = countryService.findAll();
    model.addAttribute("countries", countries);
    return "listCountriesView";
  }

  @GetMapping("/add-country")
  public String addForm(Model model) {
    return "addCountryFormView";
  }

  @PostMapping("/add-country")
  public String addPost() {
    return null;
  }
}
