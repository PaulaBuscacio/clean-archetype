# Pacote vo

## Este pacote é opcional e contém os Value Objects (VOs) usados no pacote entity.

### Exemplo de um VO:

```java
public record ExamploVO(
        String exampleField1,
        String exampleField2
) {
    public ExamploVO {
        // Validação de regras de negócio
    }
}
```
