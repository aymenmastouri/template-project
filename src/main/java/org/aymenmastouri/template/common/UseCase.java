package org.aymenmastouri.template.common;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import jakarta.transaction.Transactional;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Use Case marker.
 *
 * <p>Turns the class into a Spring Bean discoverable by component scanning. Activates {@link
 * ApplicationScope} and turns on transactions for all methods.
 */
@Retention(RUNTIME)
@Target(TYPE)
@Component
@ApplicationScope
@Transactional
public @interface UseCase {}
