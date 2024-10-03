package br.com.sicredi.client;

import br.com.sicredi.dto.cep.CepResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCep", url = "${api.ViaCep.url}")
public interface ViaCepClient {

    @GetMapping(value = "${api.ViaCep.path.cepId}")
    ResponseEntity<CepResponseDTO> getViaCep(@PathVariable("cepId") String cepId);
}
