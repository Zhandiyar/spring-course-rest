package com.zaurtregulov.spring.rest.exection_handling;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message){
        super(message);
    }
}
