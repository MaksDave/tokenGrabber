package com.example.tokengrabber.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


//Этот класс необходим для хранения имени пользователя и пароля, которые мы получили от клиента.
@Data
public class LoginRequest implements Serializable {

    @NotEmpty(message = "Usrename cannot be empty")
    private String username;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
}
