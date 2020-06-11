package com.arwest.msscbeerservice.services;

import com.arwest.msscbeerservice.domain.Beer;
import com.arwest.msscbeerservice.repositories.BeerRepository;
import com.arwest.msscbeerservice.web.controller.NotFoundException;
import com.arwest.msscbeerservice.web.mappers.BeerMapper;
import com.arwest.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service("beerService")
public class BeerServiceImpl implements BeerService {

   private final BeerRepository beerRepository;
   private final BeerMapper beerMapper;


    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDto(beerRepository.findById(beerId).orElseThrow(NotFoundException::new));
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beer.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}
