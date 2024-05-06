package com.example.demo.Repositories;

import com.example.demo.Entities.DisplayNum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisplayNumRepository extends JpaRepository<DisplayNum, String> {
}