package com.cognitree.samples.resourcedelegator.core;

/**
 * Created by giramasa on 2/19/2016.
 */

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GET {
    String value();
}
