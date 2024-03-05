package org.aymenmastouri.template.out.jpa;

import java.util.UUID;
import org.aymenmastouri.template.out.jpa.model.FooEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/** JPA Repository for {@link FooEntity}. */
interface FooRepository extends JpaRepository<FooEntity, UUID> {}
