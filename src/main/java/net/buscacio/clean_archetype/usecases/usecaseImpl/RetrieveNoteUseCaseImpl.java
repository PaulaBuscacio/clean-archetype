package net.buscacio.clean_archetype.usecases.usecaseImpl;

import net.buscacio.clean_archetype.app.dto.NoteResponseDto;
import net.buscacio.clean_archetype.usecases.repository.NoteDataRepository;
import net.buscacio.clean_archetype.usecases.RetrieveNoteUseCase;
import net.buscacio.clean_archetype.infrastructure.mapper.NoteMapperImpl;

import java.util.List;

public class RetrieveNoteUseCaseImpl implements RetrieveNoteUseCase {

    private final NoteDataRepository noteDataRepository;
    private final NoteMapperImpl mapper;

    public RetrieveNoteUseCaseImpl(NoteDataRepository noteDataRepository, NoteMapperImpl mapper) {
        this.noteDataRepository = noteDataRepository;
        this.mapper = mapper;
    }

    @Override
    public List<NoteResponseDto> retrieveAllNotes() {
        return noteDataRepository.findAll().stream()
                .map(mapper::mapToResponseDto)
                .toList();

    }
}
