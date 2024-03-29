package br.com.jvm.msgeneratetoken.framework.adapter.rest;

import br.com.jvm.msgeneratetoken.application.service.GenerateTokenService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "Auth")
@RestController
@RequestMapping("/auth")
@CrossOrigin("http://localhost:8090")
@RequiredArgsConstructor
public class TokenController {

    private final GenerateTokenService tokenService;

    @PostMapping("/token")
    public String token(Authentication authentication) {
        log.info("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        log.info("Token granted: '{}'", token);
        return token;
    }
}
