package com.example.demo.controllers;

import com.example.demo.entity.AppTest;
import com.example.demo.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/")
@Service
public class TestController {

    private TestRepo testRepo;
    @Autowired
    public TestController(TestRepo testRepo) {
        this.testRepo = testRepo;
    }

    @GetMapping("/test")
    List<AppTest> getStatitics(@RequestParam("type") int type)
    {
        return testRepo.findBestScores(type);
    }
    @PostMapping("/test")
    Optional<AppTest> addResult(@RequestBody AppTest test)
    {
        testRepo.save(test);
        return testRepo.findById(Long.valueOf(test.getIdTest()));
    }
   @GetMapping("/results")
    List<AppTest> getUserResults(@RequestParam("id_user") int id_user)
    {
        return testRepo.findByIdUser(id_user);
    }

}