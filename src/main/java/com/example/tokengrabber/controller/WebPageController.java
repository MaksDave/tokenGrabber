package com.example.tokengrabber.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class WebPageController {

    @ApiOperation(value = "", authorizations = {@Authorization(value = "jwtToken")})
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String webPage() {
        return "Welcome to the home page!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/swagger")
    public String sayHello() {
        return "Swagger Hello World";
    }
}
