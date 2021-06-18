package com.example.tokengrabber.payload.request;

import lombok.Data;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class LoginRequest implements Serializable {

    @NotEmpty(message = "Usrename cannot be empty")
    private String username;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
}
