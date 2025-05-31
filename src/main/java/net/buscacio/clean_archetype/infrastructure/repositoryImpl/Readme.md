# Pacote repositoryImpl

## Neste pacote são implementados os repositórios definidos no pacote repository. 
### A implementação pode envolver o uso de tecnologias específicas, como JPA, JDBC, ou outras bibliotecas de acesso a dados. Mais de uma implementação pode ser utilizada, dependendo do contexto da aplicação. Se for utilizado o Spring Data Access, a implementação pode ser feita por uma classe que estende `JpaRepository`, `CrudRepository` ou `MongoRepository`, por exemplo. Neste caso, a implementação é feita pelo próprio Spring, sem necessidade de escrever a implementação.

## Exemplo de repositório utilizando JPA:

```java
public interface UserRepository extends JpaRepository<User, Long> {}
```

