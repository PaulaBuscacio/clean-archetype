# Pacote mapper

## O pacote mapper é responsável por converter objetos entre diferentes camadas da aplicação. Ele implementa as interfaces do pacote mapper.usecases.

## Exemplo de mapper:

```java 
public class ExampleMapper implements ExampleMapperInterface {

    @Override
    public ExampleEntity toEntity(ExampleRequestDto dto) {
        return new ExampleEntity(dto.stringExample1(), dto.stringExample2());
    }

    @Override
    public ExampleResponseDto toResponseDto(ExampleEntity entity) {
        return new ExampleResponseDto(entity.getId(), entity.getStringExample1(), entity.getStringExample2());
    }
}
```
