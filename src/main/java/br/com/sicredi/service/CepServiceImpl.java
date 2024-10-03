package br.com.sicredi.service;

import br.com.sicredi.client.proxy.ViaCepProxy;
import br.com.sicredi.dto.cep.CepResponseDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class CepServiceImpl implements CepService {

    private final ViaCepProxy proxy;

    @Override
    public CepResponseDTO searchInfoByCEP(String cepId) {
        log.info("CepServiceImpl.searchInfoByCEP - Start - CepId: [{}]", cepId);
        var response = proxy.getInfoCep(cepId);
        log.info("CepServiceImpl.searchInfoByCEP - End - CepId: [{}], Reponse: [{}]", cepId, response);
        return response;
    }
}
