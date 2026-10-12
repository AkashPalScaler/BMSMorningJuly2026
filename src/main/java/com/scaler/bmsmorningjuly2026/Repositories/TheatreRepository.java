package com.scaler.bmsmorningjuly2026.Repositories;

import com.scaler.bmsmorningjuly2026.Models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Long> {
    Theatre findByName(String phoenix);
}
