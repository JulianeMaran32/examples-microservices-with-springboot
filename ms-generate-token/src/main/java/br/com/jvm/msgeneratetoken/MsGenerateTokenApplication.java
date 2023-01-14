package br.com.jvm.msgeneratetoken;

import br.com.jvm.msgeneratetoken.security.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class MsGenerateTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsGenerateTokenApplication.class, args);
    }
}
