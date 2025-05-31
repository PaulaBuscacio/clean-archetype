package net.buscacio.clean_archetype.infrastructure.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NoteData {

    private Long id;
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;


}
