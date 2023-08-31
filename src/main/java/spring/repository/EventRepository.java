package spring.repository;

import spring.domain.Event;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class EventRepository {

  static List<Event> events =
      Arrays.asList(
          new Event("Concert", "Berlin"),
          new Event("Ice Show", "Prague"),
          new Event("Opera", "Rome"));

  public List<Event> findAll() {
    return events;
  }

  public void save(Event event) {
    events.add(event);
  }
}
