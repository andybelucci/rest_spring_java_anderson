package br.com.anderson.rest_spring_java_anderson.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.anderson.rest_spring_java_anderson.model.Person;
import br.com.anderson.rest_spring_java_anderson.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices services;
    // private PersonServices services = new PersonServices();

    @RequestMapping(value = "/{id}", 
    method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id) throws Exception {
        return services.findById(id);
    }

}