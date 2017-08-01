package com.jimmy.npvalidator.constraints;

import com.jimmy.npvalidator.NpNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NpNotBlankValidator implements ConstraintValidator<NpNotBlank,String> {

    public void initialize(NpNotBlank npNotBlank) {

    }

    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
        if (str == null){
            return true;
        }else{
            if (str.length() >0){
                return true;
            }else{
                return false;
            }
        }
    }
}
