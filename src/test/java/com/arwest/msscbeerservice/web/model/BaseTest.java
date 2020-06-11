package com.arwest.msscbeerservice.web.model;

import com.arwest.msscbeerservice.bootstrap.BeerLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("Beer Name")
                .beerStyle(BeerStyleEnum.ALE)
                .version(21)
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(BeerLoader.BEER_1_UPC)
                .quantityOnHand(44)
                .myLocalDate(LocalDate.now())
                .build();
    }


}
