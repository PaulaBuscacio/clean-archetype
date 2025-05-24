package net.buscacio.clean_archetype.app.dto;

public record NoteResponseDto(Long id, String titulo, String conteudo, String dataCriacao, String dataAlteracao) {
}
