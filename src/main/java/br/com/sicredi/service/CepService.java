package br.com.sicredi.service;

import br.com.sicredi.dto.cep.CepResponseDTO;

public interface CepService {

    CepResponseDTO searchInfoByCEP(String cepId);
}
