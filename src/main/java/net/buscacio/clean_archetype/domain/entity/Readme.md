# Pacote entity

## Contém as classes que representam as entidades do domínio da aplicação. Estas são fundamentais pois representam o modelo  e as regras de negócio que regem a aplicação.

### Exemplo de uma entidade:

```java
public record ExampleEntity(

        Long id, String exampleTitle, ExampleVO vo, LocalDateTime createdAt, LocalDateTime updatedAt) {
    public ExampleEntity {
        // Validação de regras de negócio
    }
}
```