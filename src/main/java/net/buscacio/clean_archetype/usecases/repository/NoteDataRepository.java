package net.buscacio.clean_archetype.usecases.repository;

import net.buscacio.clean_archetype.infrastructure.data.NoteData;

import java.util.List;

public interface NoteDataRepository {

    NoteData save(NoteData noteData);

    List<NoteData> findAll();
}
