package com.example.demo.repository;

import com.example.demo.model.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TvRepository extends JpaRepository<Tv,Integer> {
}
