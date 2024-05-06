package com.example.demo.Repositories;

import com.example.demo.Entities.Display;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisplayRepository extends JpaRepository<Display, String> {
}