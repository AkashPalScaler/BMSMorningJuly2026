package com.scaler.bmsmorningjuly2026.Controllers;

import com.scaler.bmsmorningjuly2026.DTO.BookMovieRequestDTO;
import com.scaler.bmsmorningjuly2026.DTO.BookMovieResponseDTO;
import com.scaler.bmsmorningjuly2026.DTO.ResponseStatus;
import com.scaler.bmsmorningjuly2026.Models.Booking;
import com.scaler.bmsmorningjuly2026.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// localhost:3000/booking/book
@Controller
public class BookingController {
//    @Autowired - This is field injection (Not suggested for production)
    private BookingService bookingService;

    @Autowired // Constructor injection - (Good for production)
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDTO bookMovie(BookMovieRequestDTO requestDTO){
        BookMovieResponseDTO responseDTO = new BookMovieResponseDTO();
        try{
            Booking booking = bookingService.bookMovie(
                    requestDTO.getUserId(),
                    requestDTO.getShowId(),
                    requestDTO.getShowSeatIds());
            responseDTO.setBookingId(booking.getId());
            responseDTO.setBookingStatus(booking.getStatus());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setAmount(booking.getAmount());
            responseDTO.setResponseMessage("Booking Successful, please proceed to payment for confirming your booking");
        }catch (Exception e){
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setResponseMessage("Booking unsuccessful due to - " + e.getMessage());
        }
        return  responseDTO;
    }
}

// bookingMovie -> Create a booking(UNPAID) --bookingId,amount--> User [Order detail Page] ----bookingId, amount----> Proceeds to paymentGateway ---Return a success/failure event(bookingId) back to bms server