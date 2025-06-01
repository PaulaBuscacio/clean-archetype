package net.buscacio.clean_archetype.usecases.usecaseImpl;

import net.buscacio.clean_archetype.app.dto.NoteRequestDto;
import net.buscacio.clean_archetype.app.dto.NoteResponseDto;
import net.buscacio.clean_archetype.domain.entity.Note;
import net.buscacio.clean_archetype.usecases.repository.NoteDataRepository;
import net.buscacio.clean_archetype.usecases.CreateNoteUseCase;
import net.buscacio.clean_archetype.infrastructure.mapper.NoteMapperImpl;
import org.springframework.stereotype.Service;

@Service
public class CreateNoteUseCaseImpl implements CreateNoteUseCase {

    private final NoteDataRepository noteDataRepository;
    private final NoteMapperImpl mapper;

    public CreateNoteUseCaseImpl(NoteDataRepository noteDataRepository, NoteMapperImpl mapper) {
        this.noteDataRepository = noteDataRepository;
        this.mapper = mapper;
    }


    @Override
    public NoteResponseDto createNote(NoteRequestDto noteRequestDto) {
         Note noteToSave = mapper.mapToEntity(noteRequestDto);
        return mapper.mapToResponseDto(
                noteDataRepository.save(mapper.mapToData(noteToSave)));


    }
}
