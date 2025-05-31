package net.buscacio.clean_archetype.usecases.mapper;

import net.buscacio.clean_archetype.app.dto.NoteRequestDto;
import net.buscacio.clean_archetype.app.dto.NoteResponseDto;
import net.buscacio.clean_archetype.domain.entity.Note;
import net.buscacio.clean_archetype.infrastructure.data.NoteData;

public interface NoteMapper {
    Note mapToEntity(NoteRequestDto noteRequestDto);
    NoteData mapToData(Note note);
    NoteResponseDto mapToResponseDto(NoteData noteData);
}
