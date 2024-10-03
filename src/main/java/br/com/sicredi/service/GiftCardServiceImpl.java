package br.com.sicredi.service;

import br.com.sicredi.dto.gift_card.GiftCardRequestDTO;
import br.com.sicredi.dto.gift_card.GiftCardResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GiftCardServiceImpl implements GiftCardService {

    private final List<String> ranges = List.of("100", "70", "50", "30");

    @Override
    public GiftCardResponseDTO generateGiftCard(GiftCardRequestDTO request) {
        var giftCards = new ArrayList<>();
        ranges.forEach(item -> generateRanges(item, request.getPoints(), request.getValue()));
//        ranges.forEach(item -> generateRanges(item, request.getPoints(), request.getValue()).isPresent(giftCards::add));
        return null;
    }

    private Optional<?> generateRanges(String range, BigDecimal points, BigDecimal value) {
//        var valorPointsEmCache = points.divide(new BigDecimal("0.03")).setScale(2, RoundingMode.HALF_EVEN).toBigInteger();
        var valorPointsEmCache = new BigDecimal("210.00");
        var porcentagem = new BigDecimal(range).divide(new BigDecimal(100), MathContext.DECIMAL128).setScale(2, RoundingMode.HALF_UP);
        var calculateRangePercent = value.multiply(porcentagem).setScale(2, RoundingMode.HALF_EVEN);
        if (valorPointsEmCache.compareTo(calculateRangePercent) >= 0) {
            var points12 = convertCacheInPoints(calculateRangePercent, new BigDecimal("0.03"));
            System.out.println(points12);
        }
        return Optional.empty();
    }

    private BigInteger convertCacheInPoints(BigDecimal calculateRangePercent, BigDecimal factory) {
        return calculateRangePercent.divide(factory, 0, RoundingMode.HALF_EVEN).toBigInteger();
    }
}
