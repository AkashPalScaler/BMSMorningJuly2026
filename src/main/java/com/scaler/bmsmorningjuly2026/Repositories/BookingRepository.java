package com.scaler.bmsmorningjuly2026.Repositories;

import com.scaler.bmsmorningjuly2026.Models.Booking;
import com.scaler.bmsmorningjuly2026.Models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
}
