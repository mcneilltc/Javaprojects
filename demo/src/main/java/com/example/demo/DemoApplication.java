package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.Domain.CustomerInfo;
import com.example.demo.Domain.CustomerRepository;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return args -> {
            // save a couple customers
            repository.save(new CustomerInfo("Tiquila", "McNeill"));
            repository.save(new CustomerInfo("Christopher", "Bear"));
            repository.save(new CustomerInfo("Michael", "Cheese"));

            // read all customers
            log.info("Customers found with findAll():");
            log.info("______________");
            for (CustomerInfo customerInfo : repository.findAll()) {
                log.info(customerInfo.toString());
                log.info("");
            }

// read an individual customer by ID
            repository.findById(1L).ifPresent(customer -> {
                log.info("Customer found with findById(1L): ");
                log.info("_______________");
                log.info(customer.toString());
                log.info("");
            });
            //read customer by last name
            log.info("Customer found with findbyLastName('Bear'):");
            log.info("_______________");
            repository.findByLastName("Bear").forEach(bauer -> {
                log.info(bauer.toString());
});
        };
    }
}
