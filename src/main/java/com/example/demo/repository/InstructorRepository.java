package com.example.demo.repository;

import com.example.demo.entity.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InstructorRepository extends JpaRepository<InstructorEntity,Integer> {

    InstructorEntity findById(int id);
}
