/**
 * Аннотация, которая помечает, что будет инжектиться
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInjectable {
}