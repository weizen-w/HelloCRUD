package spring.service;

import spring.domain.Event;
import spring.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

  @Autowired private EventRepository eventRepository;

  public List<Event> findAll() {
    return eventRepository.findAll();
  }

  public void add(Event event) {
    eventRepository.save(event);
  }
}
