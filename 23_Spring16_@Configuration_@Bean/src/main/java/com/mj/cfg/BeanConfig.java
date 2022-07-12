package com.mj.cfg;

import com.mj.bean.DogFactoryBean;
import com.mj.domain.Person;
import com.mj.domain.Skill;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Configuration
public class BeanConfig {
    @Bean("skill")
    public Skill skill() {
        return new Skill();
    }

    @Bean("person")
    public Person person(DogFactoryBean bean) throws Exception {
        Person person = new Person();
        person.setDog(bean.getObject());
        return person;
    }

//    @Bean("dog")
//    public Dog dog() {
//        return new Dog();
//    }

//    @Bean
//    public DogFactoryBean dog() {
//        return new DogFactoryBean();
//    }
}
