package net.buscacio.clean_archetype.usecases;

import net.buscacio.clean_archetype.app.dto.NoteRequestDto;
import net.buscacio.clean_archetype.app.dto.NoteResponseDto;

public interface CreateNoteUseCase {

    NoteResponseDto createNote(NoteRequestDto noteRequestDto);
}
