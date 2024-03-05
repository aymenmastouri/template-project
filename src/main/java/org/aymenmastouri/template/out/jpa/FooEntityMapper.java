package org.aymenmastouri.template.out.jpa;

import org.aymenmastouri.template.common.DefaultMapper;
import org.aymenmastouri.template.core.domain.Foo;
import org.aymenmastouri.template.out.jpa.model.FooEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** Custom Mapper to Map between the {@link Foo} and {@link FooEntity}. */
@Mapper(config = DefaultMapper.class)
interface FooEntityMapper {
    @Mapping(target = "id", ignore = true)
    FooEntity mapToEntity(Foo foo);

    @BeanMapping(ignoreUnmappedSourceProperties = {"id"})
    Foo mapToFoo(FooEntity entity);
}
