package com.idat.semana2.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(IOException.class)
    @ResponseBody
    public String handleIOException(IOException ex) {
        System.out.println("Entro: handleIOException");
        return ex.getMessage();
	}
}
