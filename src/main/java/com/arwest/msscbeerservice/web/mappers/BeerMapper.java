package com.arwest.msscbeerservice.web.mappers;

import com.arwest.msscbeerservice.domain.Beer;
import com.arwest.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer (BeerDto beerDto);
}
