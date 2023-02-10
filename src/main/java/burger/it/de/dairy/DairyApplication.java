package burger.it.de.dairy;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "Dairy API", version = "openapi: 3.0.0", description = "Documentation Dairy API v1.0")
)
public class DairyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DairyApplication.class, args);
    }

}
