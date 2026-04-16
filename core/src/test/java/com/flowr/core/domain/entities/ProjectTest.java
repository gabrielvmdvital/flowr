package com.flowr.core.domain.entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Entities: Project")
class ProjectTest {

    @Test
    @DisplayName("Should associate an owner to the project correctly")
    void shouldAssociateOwnerToProject() {
        User owner = new User("Admin", "admin@flowr.com", "secure_hash");
        String projectName = "Flowr System";
        String description = "Agile resource management";

        Project project = new Project(projectName, description, owner);

        assertAll("Verifying project integrity",
                () -> assertEquals(projectName, project.getName()),
                () -> assertEquals(description, project.getDescription()),
                () -> assertNotNull(project.getOwner()),
                () -> assertEquals(owner.getEmail(), project.getOwner().getEmail())
        );
    }
}