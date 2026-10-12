package com.scaler.bmsmorningjuly2026.Repositories;

import com.scaler.bmsmorningjuly2026.Models.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long> {

    List<Screen> findByTheatre_Name(String phoenix);
}
