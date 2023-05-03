package classes;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

@Target(value={TYPE, FIELD})
public @interface JavaMages {

    boolean name() default true;

}
