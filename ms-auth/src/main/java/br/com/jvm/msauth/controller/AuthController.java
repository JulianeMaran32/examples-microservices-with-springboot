package br.com.jvm.msauth.controller;

import br.com.jvm.msauth.model.Login;
import br.com.jvm.msauth.service.TokenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Tag(name = "Auth")
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:8888")
public class AuthController {

    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;

    @Operation(
            summary = "Generate Token",
            operationId = "token"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                    @Content(
                            schema = @Schema(implementation = Login.class)
                    )
            })
    })
    @PostMapping("/token")
    public String token(@RequestBody Login login) throws AuthenticationException {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(login.username(), login.password())
        );
        return tokenService.generateToken(authentication);
    }
}
