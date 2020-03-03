package com.rcc.api.controller;


import com.rcc.api.dto.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translate")
public class TranslatorController {

    private static final Logger log = LoggerFactory.getLogger(TranslatorController.class);

    public static final String SUCCESS = "success";




    @GetMapping
    public ApiResponse listUser(){

        return new ApiResponse(HttpStatus.OK, SUCCESS, null);
    }



}
