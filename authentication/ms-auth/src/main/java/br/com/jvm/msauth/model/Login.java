package br.com.jvm.msauth.model;

import io.swagger.v3.oas.annotations.media.Schema;

public record Login(@Schema(example = "username") String username, @Schema(example = "password") String password) {}
