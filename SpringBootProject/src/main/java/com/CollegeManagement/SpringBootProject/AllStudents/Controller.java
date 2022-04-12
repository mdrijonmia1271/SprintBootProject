package com.CollegeManagement.SpringBootProject.AllStudents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/AllStudent")
public class Controller {

    private final Services services;

    @Autowired
    public Controller(Services services) {
        this.services = services;
    }

    @GetMapping(path = "/homePage")
    public ResponseEntity<String> homePage() {
        return new ResponseEntity<>(
                services.Greetings(),
                HttpStatus.OK
        );
    }
}
