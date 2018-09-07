package com.Exception;

public class NotFoundExceptionNew extends RuntimeException {
    private String cause;

    public NotFoundExceptionNew() {
    }

    public NotFoundExceptionNew(String cause) {
        this.cause = cause;
    }
    public String  getExCause(){
        return cause;
    }
}
