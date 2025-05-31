# Pacote repository

## Neste pacote são definidas as interfaces dos repositórios responsáveis por acessar os dados.

## Exemplos de repositórios:

```java
public interface ExampleRepository {
    ExampleEntity save(ExampleEntity entity);
    Optional<ExampleEntity> findById(Long id);
    List<ExampleEntity> findAll();
    void deleteById(Long id);
}
```