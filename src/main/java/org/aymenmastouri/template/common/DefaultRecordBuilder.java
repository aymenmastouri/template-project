package org.aymenmastouri.template.common;

import io.soabase.recordbuilder.core.RecordBuilder;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Default configuration of RecordBuilder in project. */
@RecordBuilder.Template(options = @RecordBuilder.Options(addClassRetainedGenerated = true))
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@Inherited
public @interface DefaultRecordBuilder {}
