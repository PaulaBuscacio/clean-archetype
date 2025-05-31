package net.buscacio.clean_archetype.infrastructure.repositoryImpl;

import net.buscacio.clean_archetype.infrastructure.data.NoteData;
import net.buscacio.clean_archetype.infrastructure.repository.NoteDataRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public class NoteDataRepositoryImpl implements NoteDataRepository {

    List<NoteData> noteDataList = new ArrayList<>();


    @Override
    public NoteData save(NoteData noteData) {
        noteData.setId(noteDataList.size() + 1L);
        noteDataList.add(noteData);
        return noteData;
    }

    @Override
    public List<NoteData> findAll() {
        return noteDataList;
    }
}
