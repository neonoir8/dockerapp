package ru.almaz.hwdockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.almaz.hwdockerapp.entity.Visitor;
import ru.almaz.hwdockerapp.repository.VisitorRepository;

@RestController
public class HelloController {

    private final VisitorRepository visitorRepository;

    public HelloController(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @GetMapping(value = "/hello")
    public String getHello() {
        Visitor visitor = visitorRepository.findById(1L).orElse(new Visitor());
        visitor.incrementCount();
        visitorRepository.save(visitor);
        return "Hello, Docker!!!!";
    }

    @GetMapping("/hello/visitor")
    public Long visitor() {
        Visitor visitor = visitorRepository.findById(1L).orElse(new Visitor());
        return visitor.getCount();
    }
}

