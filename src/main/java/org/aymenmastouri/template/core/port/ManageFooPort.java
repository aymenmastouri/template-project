package org.aymenmastouri.template.core.port;

import org.aymenmastouri.template.core.domain.Foo;

/** Interface for Persisting the {@link Foo}. */
public interface ManageFooPort {
    Foo saveFoo(Foo foo);
}
