package com.Exception;

public class ConflictException extends RuntimeException{
    private String exCause;
    public ConflictException(){

    }
    public ConflictException(String cause){
        this.exCause = cause;
    }
    public String  getExCause(){
        return exCause;
    }
}
