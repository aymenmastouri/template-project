package org.aymenmastouri.template.in.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.aymenmastouri.template.core.domain.Foo;
import org.aymenmastouri.template.core.usecase.ManageFooUc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Rest Controller fo managing {@link Foo} */
@RestController
@RequiredArgsConstructor
public class ManageFooController {

    private final ManageFooUc manageFooUc;
    private final FooDtoMapper mapper;

    @Operation(summary = "Create a new Foo")
    @ApiResponses(
            value = {
                @ApiResponse(responseCode = "200", description = "Foo created successfully"),
                @ApiResponse(responseCode = "400", description = "Invalid input"),
                @ApiResponse(responseCode = "500", description = "Internal server error")
            })
    @PostMapping("/foos")
    public FooDto createFoo(@RequestBody FooDto foo) {
        return mapper.toDto(manageFooUc.saveFoo(mapper.toFoo(foo)));
    }
}
