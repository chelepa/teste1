package br.com.sicredi.dto.gift_card;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class GiftCardRequestDTO {

    private BigDecimal value;
    private BigDecimal points;
}
