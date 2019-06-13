package com.example.demo;

import com.example.demo.Domain.CarRepository;
import com.example.demo.Domain.CarStock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardealershipApplication {
    private static final Logger log = LoggerFactory.getLogger(CardealershipApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CardealershipApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository repository) {
        return args -> {
            repository.save(new CarStock("Toyota", "Camry", "Sedan", "2018", "123405"));
            repository.save(new CarStock("Toyota", "Avalon", "Sedan", "2000", "157005"));
            repository.save(new CarStock("Suzuki", "Kazashi", "Sedan", "2012", "50000"));
            repository.save(new CarStock("Suzuki", "Reno", "Hatchback", "2000", "160405"));
            repository.save(new CarStock("Ford", "Taurus", "Sedan", "1999", "120405"));
            repository.save(new CarStock("Ford", "Escape", "SUV", "2018", "113405"));
            repository.save(new CarStock("Subaru", "Outback", "Wagon", "2018", "12405"));
            repository.save(new CarStock("Subaru", "Crosstek", "Crossover", "2010", "150405"));
            repository.save(new CarStock("Chevy", "Terrain", "Truck", "2000", "93405"));
            repository.save(new CarStock("Chevy", "Camaro", "Sport", "1987", "15005"));
            repository.save(new CarStock("Lincoln", "Navigator", "SUV", "1998", "190405"));
            repository.save(new CarStock("Lincoln", "Contenental", "Big-Body", "1987", "123405"));

            log.info("All the cars in stock");
            log.info("_______");
            for(CarStock carStock: repository.findAll()){
                log.info(carStock.toString());
                log.info("");
            }

            repository.findById(1L).ifPresent(car->{
               log.info("Car for with findById(1L): ");
               log.info("________");
               log.info(car.toString());
               log.info("");
            });
            repository.findByMake("Suzuki").forEach(car->{
                log.info("Car for with findbymake(): ");
                log.info("________");
                log.info(car.toString());
                log.info("");
            });
            repository.findByModel("Camry").forEach(car->{
                log.info("Car for with findBymodel: ");
                log.info("________");
                log.info(car.toString());
                log.info("");
            });
            repository.findByStyle("SUV").forEach(car->{
                log.info("Car for with findBystyle: ");
                log.info("________");
                log.info(car.toString());
                log.info("");
            });
            repository.findByYear("2018").forEach(car->{
                log.info("Car for with findByyear: ");
                log.info("________");
                log.info(car.toString());
                log.info("");
            });
            repository.findByMileage("123405").forEach(car->{
                log.info("Car for with findBymileage: ");
                log.info("________");
                log.info(car.toString());
                log.info("");
            });
        };
    }
}