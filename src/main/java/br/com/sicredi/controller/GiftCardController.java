package br.com.sicredi.controller;

import br.com.sicredi.dto.gift_card.GiftCardRequestDTO;
import br.com.sicredi.dto.gift_card.GiftCardResponseDTO;
import br.com.sicredi.service.GiftCardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GiftCardController {

    private final GiftCardService giftCardService;

    @PostMapping(value = "/v1/search")
    public ResponseEntity<GiftCardResponseDTO> searchGiftCard(@RequestBody GiftCardRequestDTO request) {
        return ResponseEntity.status(HttpStatus.OK).body(giftCardService.generateGiftCard(request));
    }
}
