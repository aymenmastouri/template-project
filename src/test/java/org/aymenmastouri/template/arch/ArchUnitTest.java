package org.aymenmastouri.template.arch;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

// See https://www.archunit.org/userguide/html/000_Index.html
@AnalyzeClasses(packages = "org.aymenmastouri.template")
public class ArchUnitTest {

    private static final String ROOT_PACKAGE = "org.aymenmastouri.template.";

    // Using layered architecture, because onion does not fully fit and dependency rules for
    // layered are easy to describe and understand.
    // Onion architecture does not fit as it has an application and domain layer.
    @ArchTest
    public static final ArchRule hexArchRule =
            layeredArchitecture()
                    .consideringOnlyDependenciesInLayers()
                    .layer("Core")
                    .definedBy(ROOT_PACKAGE + "core..")
                    .layer("Rest In Adapter")
                    .definedBy(ROOT_PACKAGE + "in.rest..")
                    .whereLayer("Core")
                    .mayOnlyAccessLayers("Core")
                    .whereLayer("Rest In Adapter")
                    .mayOnlyAccessLayers("Core");
}
