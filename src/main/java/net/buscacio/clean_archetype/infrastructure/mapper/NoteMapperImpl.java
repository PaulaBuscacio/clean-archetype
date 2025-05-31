package net.buscacio.clean_archetype.infrastructure.mapper;

import net.buscacio.clean_archetype.app.dto.NoteRequestDto;
import net.buscacio.clean_archetype.app.dto.NoteResponseDto;
import net.buscacio.clean_archetype.domain.entity.Note;
import net.buscacio.clean_archetype.infrastructure.data.NoteData;
import net.buscacio.clean_archetype.usecases.mapper.NoteMapper;

import java.time.LocalDateTime;

public class NoteMapperImpl implements NoteMapper {

    @Override
    public Note mapToEntity(NoteRequestDto noteRequestDto) {
        return new Note(
                null,
                noteRequestDto.titulo(),
                noteRequestDto.conteudo(),
                LocalDateTime.now(),
                LocalDateTime.now());
    }

    @Override
    public NoteData mapToData(Note note) {
        return new NoteData(
                null,
                note.title(),
                note.content(),
                note.createdAt().toString(),
                note.updatedAt().toString());
    }

    @Override
    public NoteResponseDto mapToResponseDto(NoteData noteData) {
        return new NoteResponseDto(
                noteData.getId(),
                noteData.getTitle(),
                noteData.getContent(),
                noteData.getCreatedAt(),
                noteData.getUpdatedAt());
    }
}
