package br.com.jvm.msauth;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Auth",
                description = "Microservice Auth",
                version = "1.0.0",
                contact = @Contact(
                        name = "Juliane Maran",
                        email = "julianemaran@gmail.com",
                        url = "https://github.com/JulianeMaran32"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"
                ),
                termsOfService = "https://example.com/terms/"
        ),
        servers = @Server(
                url = "http://localhost:8888/api"
        ),
        externalDocs = @ExternalDocumentation(
                description = "GitHub",
                url = "https://github.com/JulianeMaran32"
        )
)
public class MsAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsAuthApplication.class, args);
    }
}
