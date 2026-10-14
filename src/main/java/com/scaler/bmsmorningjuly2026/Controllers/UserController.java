package com.scaler.bmsmorningjuly2026.Controllers;

import com.scaler.bmsmorningjuly2026.DTO.ResponseStatus;
import com.scaler.bmsmorningjuly2026.DTO.UserSignUpRequestDTO;
import com.scaler.bmsmorningjuly2026.DTO.UserSignUpResponseDTO;
import com.scaler.bmsmorningjuly2026.Models.User;
import com.scaler.bmsmorningjuly2026.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    UserSignUpResponseDTO signup(UserSignUpRequestDTO requestDTO){
        UserSignUpResponseDTO responseDTO = new UserSignUpResponseDTO();
        try{
            User user = userService.signup(requestDTO.getName(), requestDTO.getEmail(), requestDTO.getPassword());
            responseDTO.setUserId(user.getId());
            responseDTO.setMessage("User signup successful");
            responseDTO.setStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDTO.setMessage("User signup failed");
            responseDTO.setStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }
}
