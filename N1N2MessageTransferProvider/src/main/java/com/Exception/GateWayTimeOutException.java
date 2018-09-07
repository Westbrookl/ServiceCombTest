package com.Exception;


public class GateWayTimeOutException extends RuntimeException {

    private String cause;
    public GateWayTimeOutException(){

    }
    public GateWayTimeOutException(String cause){
        this.cause = cause;
    }

    public String getExCause(){
        return cause;
    }
}
