package com.example.tp_j22_2.repositories;


import com.example.tp_j22_2.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
