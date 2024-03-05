package org.aymenmastouri.template.out.jpa;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.aymenmastouri.template.core.domain.Foo;
import org.aymenmastouri.template.core.port.ManageFooPort;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

/** A JPA implementation of ports for managing Foo. */
@Component
@Transactional
@RequiredArgsConstructor
public class JpaAdapter implements ManageFooPort {

    private final FooRepository fooRepository;
    private final FooEntityMapper mapper = Mappers.getMapper(FooEntityMapper.class);

    @Override
    public Foo saveFoo(Foo foo) {
        return mapper.mapToFoo(fooRepository.save(mapper.mapToEntity(foo)));
    }
}
