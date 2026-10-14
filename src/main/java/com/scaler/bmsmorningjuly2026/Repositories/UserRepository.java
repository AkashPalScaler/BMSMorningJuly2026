package com.scaler.bmsmorningjuly2026.Repositories;

import com.scaler.bmsmorningjuly2026.Models.Booking;
import com.scaler.bmsmorningjuly2026.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
