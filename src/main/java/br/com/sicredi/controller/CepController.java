package br.com.sicredi.controller;

import br.com.sicredi.dto.cep.CepResponseDTO;
import br.com.sicredi.service.CepService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CepController {

    private final CepService service;

    @GetMapping(value = "/v1/CEP/{cepId}")
    public ResponseEntity<CepResponseDTO> searchInfoByCEP(@PathVariable(value = "cepId") String cepId) {
        return ResponseEntity.status(HttpStatus.OK).body(service.searchInfoByCEP(cepId));
    }
}
