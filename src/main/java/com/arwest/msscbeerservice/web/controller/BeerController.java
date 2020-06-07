package com.arwest.msscbeerservice.web.controller;

import com.arwest.msscbeerservice.web.model.BeerDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto>getBeerById(@PathVariable("beerId")UUID beerId){
        //TODO: implement
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity saveNewBeer(@Validated @RequestBody BeerDto beerDto){
        //TODO: implement
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping("{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @Validated @RequestBody BeerDto beerDto ){
        //TODO: implement
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
