package com.spring.demo.controller;

import com.spring.demo.entity.Test;
import com.spring.demo.service.CustomTestRepository;
import com.spring.demo.service.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api")
public class TestController {
  @Autowired private TestRepository testRepository;
  @Autowired private CustomTestRepository customTestRepository;

  @PostMapping(path = "/add")
  public @ResponseBody String addNewTest(@RequestParam String name) {
    Test t = new Test();
    t.setName(name);
    testRepository.save(t);
    return "Saved";
  }

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<Test> getAllTest() {
    return testRepository.findAll();
  }

  @GetMapping(path = "/{id}")
  public @ResponseBody Test getTest(@PathVariable int id) {
    return customTestRepository.customFindMethod(id);
  }
}
