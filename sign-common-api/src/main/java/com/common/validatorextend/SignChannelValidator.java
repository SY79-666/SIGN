package com.common.validatorextend;

import com.common.Annoation.FieldName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

/**
 * @author suyu
 */
public class SignChannelValidator implements ConstraintValidator<FieldName, String> {

    @Override
    public void initialize(FieldName constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
