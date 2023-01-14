package br.com.jvm.msgeneratetoken.rest;

import br.com.jvm.msgeneratetoken.service.TokenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class TokenController {

    private final TokenService tokenService;

    @PostMapping("/token")
    public String token(Authentication authentication) {
        log.info("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        log.info("Token granted: '{}'", token);
        return token;
    }
}
