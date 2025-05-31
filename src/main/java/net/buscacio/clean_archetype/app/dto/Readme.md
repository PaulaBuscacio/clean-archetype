# Pacote dto

## DTO (Data Transfer Object) é um padrão de design usado para transferir dados.
### Um DTO não contém lógica de negócios e nao costumam ser exatamente iguais às entidades ou ao objeto que será salvo no banco de dados.
Aqui, os DTOs são responsáveis por capturar e transferir dados entre a camada de controller e a camada de usecase.
Temos pelo menos dois tipos de DTOs: um que recebe os dados de entrada e outro que mostra os dados de saída em uma requisição HTTP.
### Exemplo de DTO de entrada:
```java
public record ExampleRequestDto(String stringExample1, String stringExample2) {}
````
### Exemplo de DTO de saída:
```java
public record ExampleResponseDto(Long id, String stringExample1, String stringExample2) {}
```
