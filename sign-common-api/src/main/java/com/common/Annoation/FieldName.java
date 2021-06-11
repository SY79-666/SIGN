package com.common.Annoation;

import com.common.result.AbstractSignUser;
import com.common.validatorextend.SignChannelValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author suyu
 */

@Documented
// 可以应用于字段或属性
@Target({FIELD})
// 指定标记注解的储存方式(标记的注解由JVM保留,运行时环境可使用)
@Retention(RUNTIME)


public @interface FieldName {
    String value() default "";
}
