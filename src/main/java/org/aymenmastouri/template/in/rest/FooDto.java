package org.aymenmastouri.template.in.rest;

import io.swagger.v3.oas.annotations.media.Schema;
import org.aymenmastouri.template.core.domain.Foo;

/** A DTO for the {@link Foo} */
@Schema(description = "Foo")
public record FooDto(String name) {}
