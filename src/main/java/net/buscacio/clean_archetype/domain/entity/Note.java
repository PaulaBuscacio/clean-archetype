package net.buscacio.clean_archetype.domain.entity;

import java.time.LocalDateTime;

public record Note(Long id, String title, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {

    public Note {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("Content cannot be null or blank");
        }
        if(content.length() < title.length()) {
            throw new IllegalArgumentException("Content cannot be shorter than title");
        }

    }
}
