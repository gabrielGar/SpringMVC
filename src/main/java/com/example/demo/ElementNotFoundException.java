package com.example.demo;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

// 404
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No element found")  
public class ElementNotFoundException extends RuntimeException {
    
}