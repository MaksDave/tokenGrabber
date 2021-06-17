package com.example.tokengrabber.payload.response;

import java.io.Serializable;


//Этот класс необходим для создания ответа, содержащего JWT, который будет возвращен пользователю.
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}