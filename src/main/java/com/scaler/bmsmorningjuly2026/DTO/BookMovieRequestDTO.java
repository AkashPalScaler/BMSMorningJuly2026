package com.scaler.bmsmorningjuly2026.DTO;

import com.scaler.bmsmorningjuly2026.Models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class BookMovieRequestDTO {
    private Long userId;
    private Long showId;
    private List<Long> showSeatIds;
}
