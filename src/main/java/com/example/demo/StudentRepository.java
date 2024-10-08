package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends
        JpaRepository<Student, Long> {
    Optional<Student> findStudentsByEmail(String name);
}
