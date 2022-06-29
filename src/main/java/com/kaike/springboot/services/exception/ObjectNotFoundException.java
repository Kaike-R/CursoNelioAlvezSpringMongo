package com.kaike.springboot.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String message)
    {
        super(message);
    }

}
