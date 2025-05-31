# Pacote data

## Aqui ficam as representações dos objetos que serão salvos no banco de dados. Não devem conter lógicas de negócio.

## Exemplo de uma entidade a ser salva:

```java


@Entity
@Table(name = "example_entity")
public class ExampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exampleTitle;
    private ExampleVOData voData;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    // Getters e Setters
}
```