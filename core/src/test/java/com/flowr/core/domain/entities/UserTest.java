package com.flowr.core.domain.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Entities: User")
class UserTest {

    @Test
    @DisplayName("Should create a user correctly through the constructor")
    void shouldCreateUserWithConstructor() {
        String name = "Flowr";
        String email = "flowr@flowr.com";
        String password = "hashed_password";

        User user = new User(name, email, password);

        assertAll("Verifying user attributes",
                () -> assertEquals(name, user.getName()),
                () -> assertEquals(email, user.getEmail()),
                () -> assertEquals(password, user.getPassword())
        );
    }

    @Test
    @DisplayName("Should allow updating data through setters")
    void shouldUpdateUserUsingSetters() {
        User user = new User();
        user.setName("Original Name");

        user.setName("Updated Name");
        user.setEmail("new@flowr.com");

        assertEquals("Updated Name", user.getName());
        assertEquals("new@flowr.com", user.getEmail());
    }
}