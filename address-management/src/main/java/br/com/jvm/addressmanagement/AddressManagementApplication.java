package br.com.jvm.addressmanagement;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(
        info = @Info(
                title = "Adress Management",
                description = "Gerenciamento de Endereço, utilizando OpenFeign e API externa ViaCep",
                version = "1.0.0",
                contact = @Contact(
                        name = "Dev Juliane Maran",
                        email = "julianemaran@gmail.com",
                        url = "https://github.com/JulianeMaran32"
                ),
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0.html"),
                termsOfService = "https://example.com/terms/"
        ),
        servers = @Server(url = "http://localhost:8887/api", description = "Base URL to access the entire application"),
        externalDocs = @ExternalDocumentation(
                description = "Repository on GitHub",
                url = "https://github.com/JulianeMaran32/examples-microservices-with-springboot/tree/master/address-management"
        )
)
public class AddressManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressManagementApplication.class, args);
    }
}
