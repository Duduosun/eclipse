package qualifiers;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * Use qualifiers to provide various implementations of a particular bean type.
 */
@Qualifier
@Target({TYPE, FIELD})
@Retention(RUNTIME)
public @interface Jta {

}
