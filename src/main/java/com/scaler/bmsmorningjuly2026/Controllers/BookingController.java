package com.scaler.bmsmorningjuly2026.Controllers;

import com.scaler.bmsmorningjuly2026.DTO.BookMovieRequestDTO;
import com.scaler.bmsmorningjuly2026.DTO.BookMovieResponseDTO;
import org.springframework.stereotype.Controller;
// localhost:3000/booking/book
@Controller
public class BookingController {
    public BookMovieResponseDTO bookMovie(BookMovieRequestDTO requestDTO){
        BookMovieResponseDTO responseDTO = new BookMovieResponseDTO();
        return  responseDTO;
    }
}

// Break till 8:11 AM