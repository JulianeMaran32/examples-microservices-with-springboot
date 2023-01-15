package br.com.jvm.msgeneratetoken.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "rsa")
public record RsaKeyProperties(@Schema(name = "publicKey") RSAPublicKey publicKey,
                               @Schema(name = "privateKey") RSAPrivateKey privateKey) {
}
