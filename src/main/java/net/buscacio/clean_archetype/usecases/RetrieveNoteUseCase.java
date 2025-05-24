package net.buscacio.clean_archetype.usecases;

import net.buscacio.clean_archetype.app.dto.NoteResponseDto;

import java.util.List;

public interface RetrieveNoteUseCase {

    List<NoteResponseDto> retrieveAllNotes();
}
