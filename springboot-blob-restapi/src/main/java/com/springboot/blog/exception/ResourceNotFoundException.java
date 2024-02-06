package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private String fieldName;
    private String ResourceName;
    private int fieldValue;

    public ResourceNotFoundException(String fieldName, String resourceName, int fieldValue) {
        super(String.format("%s is not found " +
                "with %s : %s",resourceName,
                fieldName,fieldValue ));
        this.fieldName = fieldName;
        ResourceName = resourceName;
        this.fieldValue = fieldValue;
    }

}
