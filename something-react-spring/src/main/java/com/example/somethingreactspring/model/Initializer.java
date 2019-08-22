package com.example.somethingreactspring.model;

import com.example.somethingreactspring.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner {
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void run(String ... strings){
        Stream.of("Denver", "Utah", "Seattle", "Richmond").forEach(name-> groupRepository.save(new Group(name)));
    }
    Group djug = groupRepository.findByName("Denver JUG");
    Event e = Event.builder().title("Full Stack Reactive")
            .description("Reactive with Spring Boot + React")
            .date(Instant.parse("2018-12-12T18:00:00.000Z"))
            .build();
        djug.setEvents(Collections.singleton(e));
        groupRepository.save(djug);

        groupRepository.findAll().forEach(System.out::println);
}
}
