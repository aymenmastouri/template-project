package org.aymenmastouri.template.common;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

/** Default MapStruct configuration to use */
@MapperConfig(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        unmappedSourcePolicy = ReportingPolicy.WARN)
public interface DefaultMapper {}
