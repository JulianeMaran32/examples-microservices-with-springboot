package br.com.jvm.addressmanagement.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Tag(name = "Address", description = "Dados do response do CEP")
public class Address {

    @Schema(name = "cep", example = "80030-000", type = "String")
    private String cep;

    @Schema(name = "logradouro", example = "Avenida João Gualberto", type = "String")
    private String logradouro;

    @Schema(name = "complemento", example = "até 1343/1344", type = "String")
    private String complemento;

    @Schema(name = "bairro", example = "Alto da Glória", type = "String")
    private String bairro;

    @Schema(name = "localidade", example = "Curitiba", type = "String")
    private String localidade;

    @Schema(name = "uf", example = "PR", type = "String")
    private String uf;

    @Schema(name = "ibge", example = "4106902", type = "String")
    private String ibge;

    @Schema(name = "gia", example = "", type = "String")
    private String gia;

    @Schema(name = "ddd", example = "41", type = "String")
    private String ddd;

    @Schema(name = "siafi", example = "7535", type = "String")
    private String siafi;

}
