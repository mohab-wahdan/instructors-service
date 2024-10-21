package com.example.demo.controller;

import com.example.demo.entity.InstructorEntity;
import com.example.demo.repository.InstructorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController()
public class InstructorController {

    private InstructorRepository instructorRepository;
    public InstructorController(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }


    @GetMapping("/instructors")
    public List<InstructorEntity> getAllInstructors() {
        List<InstructorEntity> list = instructorRepository.findAll();
        list.stream().forEach(System.out::println);
        return list;
    }
//    @GetMapping("/instructors/{id}")
//    public InstructorEntity getAllInstructors(@PathVariable int id) {
//        return instructorRepository.findById(id);
//    }
}
