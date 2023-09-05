package spring.repository;

import spring.domain.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EventRepository {

  static List<Event> events =
      new ArrayList<>(
          Arrays.asList(
              new Event("Concert", "Berlin", 49.50),
              new Event("Ice Show", "Prague", 60),
              new Event("Opera", "Rome", 84.99)));

  public List<Event> findAll() {
    return events;
  }

  public Event findById(int id) {
    return events.get(id);
  }

  public void save(Event event) {
    events.add(event);
  }

  public void save(int id, Event event) {
    Event updateEvent = events.get(id);
    updateEvent.setName(event.getName());
    updateEvent.setCity(event.getCity());
    updateEvent.setPrice(event.getPrice());
  }

  public void remove(int id) {
    events.remove(id);
  }
}
