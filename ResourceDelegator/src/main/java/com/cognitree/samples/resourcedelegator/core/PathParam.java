package com.cognitree.samples.resourcedelegator.core;

/**
 * Created by giramasa on 2/19/2016.
 */

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PathParam {
    String value();
}
