package spring.domain;

public class Event {
  private String name;
  private String city;
  private double price;

  public Event() {
  }

  public Event(String name, String city, double price) {
    this.name = name;
    this.city = city;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
