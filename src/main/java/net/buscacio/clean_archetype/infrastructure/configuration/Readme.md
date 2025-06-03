# Pacote configuration

## Contém as configurações necessárias da aplicação. Como este o Spring pode não reconhecer os beans da aplicação, devemos instanciá-los aqui.
## Exemplo de configuração de um bean:

```java
import org.springframework.context.annotation.Bean;

@Configuration
public class BeanConfig {

    @Bean
    public ExampleController exampleController(RequestExampleUseCase requestExampleUseCase) {
        return new ExampleController(requestExampleUseCase);
    }
    
    @Bean
    public RequestExampleUseCase requestExampleUseCase(ExampleRepository exampleRepository, ExampleMapper exampleMapper) {
        return new RequestExampleUseCaseImpl(exampleRepository, exampleMapper);
    }
}
```