package etu1920.framework;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
    String parametre() default " ";

}
