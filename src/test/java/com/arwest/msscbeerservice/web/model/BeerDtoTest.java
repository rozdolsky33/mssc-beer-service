package com.arwest.msscbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;


@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializationDto() throws JsonProcessingException {

        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);

    }

    @Test
    void testDeserializeDto() throws IOException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2019-06-03T21:01:53-0400\",\"lastUpdatedDate\":\"2019-06-03T21:01:53.628287-04:00\",\"myLocalDate\":\"20190603\",\"beerId\":\"8ed4c7eb-ef3a-437e-823e-a26497ed7e71\"}\n";;

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }

}