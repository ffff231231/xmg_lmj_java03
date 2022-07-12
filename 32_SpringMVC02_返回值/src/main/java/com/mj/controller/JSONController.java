package com.mj.controller;

import com.mj.domain.Car;
import com.mj.domain.Dog;
import com.mj.domain.Person;
import com.mj.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class JSONController {

    @RequestMapping(value = "/json1", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String json1() {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(20);

        Car car = new Car();
        car.setName("Bently");
        car.setPrice(100);
        person.setCar(car);

        return "{\"name\":\"Jack\",\"age\":20,\"car\":{\"name\":\"Bently\",\"price\":100}}";
    }

    @RequestMapping(value = "/json2")
    @ResponseBody
    public Student json2() {
        Student student = new Student();
        student.setName("Jack");
        student.setAge(20);

        Dog dog = new Dog();
        dog.setName("Bently");
        dog.setPrice(100);
        student.setDog(dog);

        return student;
    }
}
