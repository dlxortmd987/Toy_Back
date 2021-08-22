package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping(value = "/api/back", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getMyData()
    { return "{\"result\":\"ok\"}"; }

}
