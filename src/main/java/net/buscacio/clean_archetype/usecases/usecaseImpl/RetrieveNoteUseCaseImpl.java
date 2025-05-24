package net.buscacio.clean_archetype.usecases.usecaseImpl;

import net.buscacio.clean_archetype.app.dto.NoteResponseDto;
import net.buscacio.clean_archetype.infrastructure.repository.NoteDataRepository;
import net.buscacio.clean_archetype.usecases.RetrieveNoteUseCase;
import net.buscacio.clean_archetype.usecases.mapper.NoteMapper;

import java.util.List;

public class RetrieveNoteUseCaseImpl implements RetrieveNoteUseCase {

    private final NoteDataRepository noteDataRepository;
    private final NoteMapper mapper;

    public RetrieveNoteUseCaseImpl(NoteDataRepository noteDataRepository, NoteMapper mapper) {
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
