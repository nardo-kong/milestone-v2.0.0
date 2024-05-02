package com.example.demo.Repositories;
import com.example.demo.Entities.FinalTable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FinalTableRepository extends JpaRepository<FinalTable, Integer> {
}