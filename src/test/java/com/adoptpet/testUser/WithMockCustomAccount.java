package com.adoptpet.testUser;

import org.springframework.security.test.context.support.WithSecurityContext;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithSecurityContext(factory = WithMockCustomAccountSecurityContextFactory.class)
public @interface WithMockCustomAccount {

    String username() default "username";

    String name() default "name";

    String email() default "test-email";

    String role() default "ROLE_USER";

    String registrationId() default "google";
}