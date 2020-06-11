package com.arwest.msscbeerservice.web.controller;

import com.arwest.msscbeerservice.repositories.BeerRepository;
import com.arwest.msscbeerservice.services.BeerService;
import com.arwest.msscbeerservice.web.mappers.BeerMapper;
import com.arwest.msscbeerservice.web.model.BeerDto;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto>getBeerById(@PathVariable("beerId")UUID beerId){
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Validated @RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);

    }
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @Validated @RequestBody BeerDto beerDto ){
        return new ResponseEntity<>(beerService.updateBeer(beerId,beerDto), HttpStatus.NO_CONTENT);
    }
}
