package org.aymenmastouri.template.out.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.aymenmastouri.template.core.domain.Foo;
import org.hibernate.annotations.UuidGenerator;

/** An Entity stereotype for {@link Foo}. */
@Entity
@Table(name = "FOO")
@ToString(onlyExplicitlyIncluded = true)
@Setter
@Getter
public class FooEntity extends BaseEntity {
    @Id @GeneratedValue @UuidGenerator private UUID id;

    @Column(nullable = false)
    @NotBlank
    private String name;
}
