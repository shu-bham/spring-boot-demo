package com.spring.demo.controller;

import com.spring.demo.entity.Test;
import com.spring.demo.service.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller @RequestMapping(path = "/") public class TestController {
    @Autowired private TestRepository userRepository;

    @PostMapping(path = "/add") public @ResponseBody String addNewUser(@RequestParam String name) {

        Test t = new Test();
        t.setName(name);
        userRepository.save(t);
        return "Saved";
    }

    @GetMapping(path = "/all") public @ResponseBody Iterable<Test> getAllUsers() {
        return userRepository.findAll();
    }
}