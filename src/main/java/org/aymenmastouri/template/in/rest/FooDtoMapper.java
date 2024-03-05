package org.aymenmastouri.template.in.rest;

import org.aymenmastouri.template.common.DefaultMapper;
import org.aymenmastouri.template.core.domain.Foo;
import org.mapstruct.Mapper;

@Mapper(config = DefaultMapper.class)
interface FooDtoMapper {
    FooDto toDto(Foo source);

    Foo toFoo(FooDto source);
}
