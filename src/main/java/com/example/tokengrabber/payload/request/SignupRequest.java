package com.example.tokengrabber.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class SignupRequest {
    @NotEmpty(message = "Please enter username")
    private String username;
    @NotEmpty(message = "Please enter password")
    @Size(min = 6)
    private String password;
}
