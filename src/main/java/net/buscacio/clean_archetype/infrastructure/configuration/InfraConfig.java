package net.buscacio.clean_archetype.infrastructure.configuration;

import net.buscacio.clean_archetype.app.controller.NoteController;
import net.buscacio.clean_archetype.infrastructure.repository.NoteDataRepository;
import net.buscacio.clean_archetype.infrastructure.repositoryImpl.NoteDataRepositoryImpl;
import net.buscacio.clean_archetype.usecases.CreateNoteUseCase;
import net.buscacio.clean_archetype.usecases.RetrieveNoteUseCase;
import net.buscacio.clean_archetype.usecases.mapper.NoteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfraConfig {
    @Bean
    public NoteController noteController(CreateNoteUseCase createNoteUseCase, RetrieveNoteUseCase retrieveNoteUseCase){
        return new NoteController(createNoteUseCase, retrieveNoteUseCase);
    }

    @Bean
    public NoteMapper noteMapper(){
        return new NoteMapper();
    }

    @Bean
    public NoteDataRepository noteDataRepository(){
        return new NoteDataRepositoryImpl();
    }


}
