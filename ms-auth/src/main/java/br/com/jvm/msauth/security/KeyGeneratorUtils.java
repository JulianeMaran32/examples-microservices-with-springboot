package br.com.jvm.msauth.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class KeyGeneratorUtils {

    public static KeyPair generateRsaKey() {
        KeyPair keyPair;

        try {
            var keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

        return keyPair;
    }
}
