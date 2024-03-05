package org.aymenmastouri.template.core.domain;

import org.aymenmastouri.template.common.DefaultRecordBuilder;

/** A record of {@link Foo}. */
@DefaultRecordBuilder
public record Foo(String name) {}
