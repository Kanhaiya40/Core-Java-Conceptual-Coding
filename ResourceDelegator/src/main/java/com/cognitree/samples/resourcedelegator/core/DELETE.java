package com.cognitree.samples.resourcedelegator.core;

/**
 * Created by giramasa on 2/19/2016.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DELETE {
    String value();
}
