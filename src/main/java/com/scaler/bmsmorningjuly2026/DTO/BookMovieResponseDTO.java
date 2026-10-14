package com.scaler.bmsmorningjuly2026.DTO;

import com.scaler.bmsmorningjuly2026.Models.BookingStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDTO {
    private Long bookingId;
    private Double amount;
    private BookingStatus bookingStatus;
    private ResponseStatus status;
    private String responseMessage;
}
