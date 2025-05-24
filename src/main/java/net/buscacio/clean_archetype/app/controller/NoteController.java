package net.buscacio.clean_archetype.app.controller;

import lombok.AllArgsConstructor;
import net.buscacio.clean_archetype.app.dto.NoteRequestDto;
import net.buscacio.clean_archetype.app.dto.NoteResponseDto;
import net.buscacio.clean_archetype.usecases.CreateNoteUseCase;
import net.buscacio.clean_archetype.usecases.DeleteNoteUseCase;
import net.buscacio.clean_archetype.usecases.RetrieveNoteUseCase;
import net.buscacio.clean_archetype.usecases.UpdateNoteUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

     private final CreateNoteUseCase createNoteUseCase;
     private final RetrieveNoteUseCase retrieveNoteUseCase;

    public NoteController(CreateNoteUseCase createNoteUseCase, RetrieveNoteUseCase retrieveNoteUseCase) {
        this.createNoteUseCase = createNoteUseCase;
        this.retrieveNoteUseCase = retrieveNoteUseCase;
    }

    @GetMapping
    public List<NoteResponseDto> getNotes() {
        return retrieveNoteUseCase.retrieveAllNotes();
    }

    @PostMapping()
    public NoteResponseDto createNote(@RequestBody NoteRequestDto note) {
       return createNoteUseCase.createNote(note);
    }
}
