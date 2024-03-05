package org.aymenmastouri.template.core.usecase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aymenmastouri.template.common.UseCase;
import org.aymenmastouri.template.core.domain.Foo;
import org.aymenmastouri.template.core.port.ManageFooPort;

/** Use Case to manage foo.s */
@UseCase
@RequiredArgsConstructor
@Slf4j
public class ManageFooUc {

    private final ManageFooPort manageFooPort;

    public Foo saveFoo(Foo foo) {
        log.debug("save foo {}", foo.toString());
        return manageFooPort.saveFoo(foo);
    }
}
