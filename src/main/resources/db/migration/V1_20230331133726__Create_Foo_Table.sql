CREATE
    TABLE
        foo(
            id UUID NOT NULL,
            modification_counter BIGINT NOT NULL,
            created_date TIMESTAMP NOT NULL,
            last_modified_date TIMESTAMP NOT NULL,
            name VARCHAR(255) NOT NULL,
            CONSTRAINT pk_foo PRIMARY KEY(id)
        );