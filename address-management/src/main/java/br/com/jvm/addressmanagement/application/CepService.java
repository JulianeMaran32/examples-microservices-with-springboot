package br.com.jvm.addressmanagement.application;

import br.com.jvm.addressmanagement.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/")
public interface CepService {

    @GetMapping("{cep}/json")
    Address getAddressByCep(@PathVariable(name = "cep") String cep);

}