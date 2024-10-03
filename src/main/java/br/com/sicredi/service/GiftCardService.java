package br.com.sicredi.service;

import br.com.sicredi.dto.gift_card.GiftCardRequestDTO;
import br.com.sicredi.dto.gift_card.GiftCardResponseDTO;

public interface GiftCardService {

    GiftCardResponseDTO generateGiftCard(GiftCardRequestDTO request);
}
