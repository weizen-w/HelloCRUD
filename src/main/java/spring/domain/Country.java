package spring.domain;

public class Country {

  public String title;
  public String capital;

  public Country(String title, String capital) {
    this.title = title;
    this.capital = capital;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }
}
