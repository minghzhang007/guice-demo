package com.lewis;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2018/1/4.
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Output {
}
