package br.com.sicredi.client.proxy;

import br.com.sicredi.client.ViaCepClient;
import br.com.sicredi.dto.cep.CepResponseDTO;
import br.com.sicredi.exceptions.ViaCepClientException;
import feign.FeignException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ViaCepProxy {

    private final ViaCepClient proxy;

    public CepResponseDTO getInfoCep(String cepId) {
        log.info("ViaCepProxy.getInfoCep - Start - CepId: [{}]", cepId);
        CepResponseDTO response;
        try {
            response = proxy.getViaCep(cepId).getBody();
        } catch (FeignException fe) {
            throw new ViaCepClientException("ViaCepClientException - error  - " + fe.getMessage());
        }
        log.info("ViaCepProxy.getInfoCep - End - CepId: [{}], response: [{}]", cepId, response);
        return response;
    }

}
