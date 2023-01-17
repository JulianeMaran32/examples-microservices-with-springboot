package br.com.jvm.addressmanagement.framework;

import br.com.jvm.addressmanagement.application.CepService;
import br.com.jvm.addressmanagement.domain.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CepController {

    private final CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<Address> getCep(@PathVariable String cep) {

        Address address = cepService.getAddressByCep(cep);

        return address != null ? ResponseEntity.ok().body(address) : ResponseEntity.notFound().build();
    }

}
