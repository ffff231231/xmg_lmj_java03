package com.mj.controller;

import com.mj.domain.Car;
import com.mj.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class XMLController {

    @RequestMapping(value = "/xml1", produces = "application/xml; charset=UTF-8")
    @ResponseBody
    public String xml1() {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(20);

        Car car = new Car();
        car.setName("Bently");
        car.setPrice(100);
        person.setCar(car);

        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<person name=\"" + person.getName() + "\" age=\"" + person.getAge() +"\">"
                + "<car name=\"" + car.getName() + "\" price=\"" + car.getPrice() + "\">"
                + "</person>";
    }

    @RequestMapping(value = "/xml2")
    @ResponseBody
    public Person xml2() {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(20);

        Car car = new Car();
        car.setName("Bently");
        car.setPrice(100);
        person.setCar(car);

        return person;
    }
}
