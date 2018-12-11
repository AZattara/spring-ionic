package com.dpdnti.uema.resources.exception;

import java.util.List;
import java.util.ArrayList;

public class ValidationError extends StandardError {

      List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }

    public List<FieldMessage> getErrors(){
        return errors;
    }

    public void addError(String fieldName, String message){
        errors.add(new FieldMessage(fieldName, message));
    }
}
