package net.buscacio.clean_archetype.infrastructure.configuration;

import net.buscacio.clean_archetype.infrastructure.repository.NoteDataRepository;
import net.buscacio.clean_archetype.usecases.CreateNoteUseCase;
import net.buscacio.clean_archetype.usecases.RetrieveNoteUseCase;
import net.buscacio.clean_archetype.usecases.mapper.NoteMapper;
import net.buscacio.clean_archetype.usecases.usecaseImpl.CreateNoteUseCaseImpl;
import net.buscacio.clean_archetype.usecases.usecaseImpl.RetrieveNoteUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public RetrieveNoteUseCase retrieveNoteUseCase(NoteMapper mapper, NoteDataRepository noteDataRepository) {
        return new RetrieveNoteUseCaseImpl(noteDataRepository, mapper);
    }
    @Bean
    public CreateNoteUseCase createNoteUseCase(NoteMapper mapper, NoteDataRepository noteDataRepository) {
        return new CreateNoteUseCaseImpl(noteDataRepository, mapper);
    }
}
