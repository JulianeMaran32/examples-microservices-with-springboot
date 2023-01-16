package br.com.jvm.msgeneratetoken;

import br.com.jvm.msgeneratetoken.domain.RsaKeyProperties;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
@OpenAPIDefinition(
        info = @Info(
                title = "Generate Token",
                description = "Microservice to generate token or being able to generate token to access user profile.",
                version = "1.0.0",
                contact = @Contact(
                        name = "Dev Juliane Maran",
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
                url = "http://localhost:8090/api",
                description = "Base URL to access the entire application"
        ),
        externalDocs = @ExternalDocumentation(
                description = "Repository on GitHub",
                url = "https://github.com/JulianeMaran32/examples-microservices-with-springboot"
        )
)
public class MsGenerateTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsGenerateTokenApplication.class, args);
    }
}
