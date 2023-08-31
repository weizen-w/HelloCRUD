package spring.controller;

import spring.domain.Event;
import spring.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EventController {

  @Autowired private EventService eventService;

  @GetMapping("/")
  public String listForm(Model model) {
    List<Event> events = eventService.findAll();
    model.addAttribute("events", events);
    return "listEventsView";
  }

  @GetMapping("/add-event")
  public String addForm(Model model) {
    return "addEventFormView";
  }

  @PostMapping("/add-event")
  public String addPost() {
    return null;
  }
}
